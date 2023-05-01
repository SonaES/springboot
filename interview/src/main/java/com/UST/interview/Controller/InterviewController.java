package com.UST.interview.Controller;


import com.UST.interview.Entity.Interview;

import com.UST.interview.Service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterviewController {

    @Autowired
    public InterviewService service;

    @PostMapping("/add")
    public Interview addDetails(@RequestBody Interview interview){
        return service.addInterviewDetails(interview);
    }

    @GetMapping("/details")
    public List<Interview> getDetails(){
        return service.getAllDetails();
    }

    @GetMapping("/details/{id}")
    public Interview getDetailsById(@PathVariable int id){
        return service.findDetailsById(id);
    }

}
