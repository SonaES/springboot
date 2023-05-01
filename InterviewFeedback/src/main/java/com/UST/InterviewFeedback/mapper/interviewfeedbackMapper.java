package com.UST.InterviewFeedback.mapper;

import com.UST.InterviewFeedback.dto.interviewfeedbackDTO;
import com.UST.InterviewFeedback.entity.interviewfeedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface interviewfeedbackMapper extends GenericMapper<interviewfeedback, interviewfeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    interviewfeedback asEntity(interviewfeedbackDTO dto);
}