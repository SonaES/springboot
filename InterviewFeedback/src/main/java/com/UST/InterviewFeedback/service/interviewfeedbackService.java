package com.UST.InterviewFeedback.service;

import com.UST.InterviewFeedback.entity.interviewfeedback;

import java.util.Optional;

public interface interviewfeedbackService extends GenericService<interviewfeedback,Long> {
    void deleteById(long id);

    Optional<interviewfeedback> findById(long id);
}