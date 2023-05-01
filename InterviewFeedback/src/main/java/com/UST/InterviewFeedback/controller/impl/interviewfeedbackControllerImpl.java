package com.UST.InterviewFeedback.controller.impl;

import com.UST.InterviewFeedback.controller.interviewfeedbackController;
import com.UST.InterviewFeedback.dto.interviewfeedbackDTO;
import com.UST.InterviewFeedback.entity.interviewfeedback;
import com.UST.InterviewFeedback.mapper.interviewfeedbackMapper;
import com.UST.InterviewFeedback.service.interviewfeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/interviewfeedback")
@RestController
public class interviewfeedbackControllerImpl implements interviewfeedbackController {
    private final interviewfeedbackService interviewfeedbackService;
    private final interviewfeedbackMapper interviewfeedbackMapper;

    public interviewfeedbackControllerImpl(interviewfeedbackService interviewfeedbackService, interviewfeedbackMapper interviewfeedbackMapper) {
        this.interviewfeedbackService = interviewfeedbackService;
        this.interviewfeedbackMapper = interviewfeedbackMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public interviewfeedbackDTO save(@RequestBody interviewfeedbackDTO interviewfeedbackDTO) {
        interviewfeedback interviewfeedback = interviewfeedbackMapper.asEntity(interviewfeedbackDTO);
        return interviewfeedbackMapper.asDTO(interviewfeedbackService.save(interviewfeedback));
    }

    @Override
    @GetMapping("/{id}")
    public interviewfeedbackDTO findById(@PathVariable("id") long id) {
        interviewfeedback interviewfeedback = interviewfeedbackService.findById(id).orElse(null);
        return interviewfeedbackMapper.asDTO(interviewfeedback);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        interviewfeedbackService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<interviewfeedbackDTO> list() {
        return interviewfeedbackMapper.asDTOList(interviewfeedbackService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<interviewfeedbackDTO> pageQuery(Pageable pageable) {
        Page<interviewfeedback> interviewfeedbackPage = interviewfeedbackService.findAll(pageable);
        List<interviewfeedbackDTO> dtoList = interviewfeedbackPage
                .stream()
                .map(interviewfeedbackMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, interviewfeedbackPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public interviewfeedbackDTO update(@RequestBody interviewfeedbackDTO interviewfeedbackDTO, @PathVariable("id") long id) {
        interviewfeedback interviewfeedback = interviewfeedbackMapper.asEntity(interviewfeedbackDTO);
        return interviewfeedbackMapper.asDTO(interviewfeedbackService.update(interviewfeedback, id));
    }
}