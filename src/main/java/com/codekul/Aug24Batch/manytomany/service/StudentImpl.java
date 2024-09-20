package com.codekul.Aug24Batch.manytomany.service;

import com.codekul.Aug24Batch.manytomany.entity.Student;
import com.codekul.Aug24Batch.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "student saved successfully";
    }

    @Override
    public List<Map<String,Object>> getStudent() {
    return studentRepository.getStudentData();
    }
}

