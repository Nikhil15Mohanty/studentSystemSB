package com.nikhil.studentsystem.service;

import com.nikhil.studentsystem.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    List<Student> getAllStudent();



}
