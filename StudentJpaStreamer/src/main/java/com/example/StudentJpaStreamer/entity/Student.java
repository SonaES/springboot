package com.example.StudentJpaStreamer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_tbl")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String studentId;
    private String studentName;
    private String emailId;
    private String phoneNo;
    private  String qualification;
    private int workingExp;
    @ElementCollection
    private List<String> interestedCourses;
    private String address;
    private  String comment;
}
