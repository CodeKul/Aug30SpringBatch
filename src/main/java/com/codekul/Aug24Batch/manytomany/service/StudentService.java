package com.codekul.Aug24Batch.manytomany.service;

import com.codekul.Aug24Batch.manytomany.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    String saveStudent(Student student);

    List<Map<String,Object>> getStudent();
}
