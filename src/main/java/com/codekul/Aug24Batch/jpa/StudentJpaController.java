package com.codekul.Aug24Batch.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("studentJpa")
public class StudentJpaController {

    @Autowired
    private StudentJpaRepository studentRepository;

    @PostMapping("save")
    public String saveStudent(@RequestBody StudentJpa student) {
        studentRepository.save(student);
        return "student saved";
    }

    @GetMapping("getAllStudent")
    public List<StudentJpa> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("getStudent/{id}")
    public Optional<StudentJpa> getStudent(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }

    @GetMapping("getStudentByName/{name}")
    public StudentJpa getStudent(@PathVariable("name") String name) {
        return studentRepository.findByNameEquals(name);
    }

    @GetMapping("getStudentByNameAndAddress/{name}/{address}")
    public StudentJpa getStudent(@PathVariable("name") String name, @PathVariable("address") String address) {
        return studentRepository.findByNameAndAddress(name, address);
    }

    @GetMapping("getStudent")
    public Optional<StudentJpa> getStudentByParam(@RequestParam(required = false) Long id) {
        return studentRepository.findById(id);
    }

    @PutMapping("update")
    public String updateStudent(@RequestBody StudentJpa student) {
        studentRepository.save(student);
        return "student updated";
    }

    @PutMapping("update1")
    public String updateStudent1(@RequestBody StudentJpa st) {
        var student = new StudentJpa();
        Optional<StudentJpa> student1 = studentRepository.findById(st.getId());
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
    public String deleteById(@RequestBody StudentJpa student) {
        studentRepository.delete(student);
        return "deleted";
    }

    @DeleteMapping("deleteAll/{id}")
    public String deleteById(@PathVariable("id") List<Long> id) {
        studentRepository.deleteAllById(id);
        return "deleted";
    }

    @GetMapping("selectDistinct/{name}/{address}")
    public List<StudentJpa> distinct(@PathVariable("name") String name, @PathVariable("address") String address) {
        return studentRepository.findDistinctByNameAndAddress(name, address);
    }

    @GetMapping("dobBetween/{startDate}/{endDate}")
    public List<StudentJpa> distinct(@PathVariable("startDate") LocalDate startDate, @PathVariable("endDate") LocalDate endDate) {
        return studentRepository.findByDobBetween(startDate, endDate);
    }

    @GetMapping("heightLessThan/{height}")
    public List<StudentJpa> distinct(@PathVariable("height") Integer height) {
        return studentRepository.findByHeightLessThan(height);
    }


}
