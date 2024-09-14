package com.codekul.Aug24Batch.manytomany.controller;

import com.codekul.Aug24Batch.manytomany.entity.Student;
import com.codekul.Aug24Batch.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("save")
    public String saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
