package com.UST.InterviewFeedback.dao;

import com.UST.InterviewFeedback.entity.interviewfeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewfeedbackRepository extends PagingAndSortingRepository<interviewfeedback,Long> {
}