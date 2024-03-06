package com.nikhil.studentsystem.controller;

import com.nikhil.studentsystem.entity.Student;
import com.nikhil.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


}
