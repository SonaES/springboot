package com.example.StudentJpaStreamer.service;

import com.example.StudentJpaStreamer.entity.Student;
import com.example.StudentJpaStreamer.entity.Student$;
import com.example.StudentJpaStreamer.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private JPAStreamer jpaStreamer;
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }


    public Long getAllByCourse(String course) {
        Predicate<Student> courseFilter = student -> student.getInterestedCourses().contains(course);
        return jpaStreamer.stream(Student.class)
                .filter(courseFilter)
                .count();
    }
    public List<Student> getListByAddress(String address) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.address.contains(address))
                .collect(Collectors.toList());
    }
}
