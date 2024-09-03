package com.codekul.Aug24Batch.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("save")
    public String saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "student saved";
    }

    @GetMapping("getAllStudent")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }

    @GetMapping("getStudentByName/{name}")
    public Student getStudent(@PathVariable("name") String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping("getStudentByNameAndAddress/{name}/{address}")
    public Student getStudent(@PathVariable("name") String name, @PathVariable("address") String address) {
        return studentRepository.findByNameAndAddress(name, address);
    }

    @GetMapping("getStudent")
    public Optional<Student> getStudentByParam(@RequestParam(required = false) Long id) {
        return studentRepository.findById(id);
    }

    @PutMapping("update")
    public String updateStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "student updated";
    }

    @PutMapping("update1")
    public String updateStudent1(@RequestBody Student st) {
        var student = new Student();
        Optional<Student> student1 = studentRepository.findById(st.getId());
        student.setId(st.getId());
        student.setName(student1.get().getName());
        student.setAddress(st.getAddress());
        studentRepository.save(student);
        return "updated";
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "deleted";
    }

    @DeleteMapping("deleteByObject")
    public String deleteById(@RequestBody Student student) {
        studentRepository.delete(student);
        return "deleted";
    }

    @DeleteMapping("deleteAll/{id}")
    public String deleteById(@PathVariable("id") List<Long> id) {
        studentRepository.deleteAllById(id);
        return "deleted";
    }


}
