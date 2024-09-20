package com.codekul.Aug24Batch.manytomany.controller;

import com.codekul.Aug24Batch.manytomany.entity.Student;
import com.codekul.Aug24Batch.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student")
@CrossOrigin(allowedHeaders = {"Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization"}, methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("save")
    public String saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
   @PostMapping("getStudent")
    public List<Map<String,Object>> getStudent() {
        return studentService.getStudent();
    }


}
