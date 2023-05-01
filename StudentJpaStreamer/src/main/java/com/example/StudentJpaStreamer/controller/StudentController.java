package com.example.StudentJpaStreamer.controller;

import com.example.StudentJpaStreamer.entity.Student;
import com.example.StudentJpaStreamer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student addDetails(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/student/{course}")
    public Long getAllByCourse(@PathVariable String course){
        return studentService.getAllByCourse(course);
    }
    @GetMapping("/students/{address}")
    public List<Student> getListByAddress(@PathVariable String address){
        return studentService.getListByAddress(address);
    }

}
