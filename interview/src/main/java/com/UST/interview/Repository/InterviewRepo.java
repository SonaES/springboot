package com.UST.interview.Repository;


import com.UST.interview.Entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepo extends JpaRepository<Interview,Integer> {
}
