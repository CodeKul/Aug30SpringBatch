package com.codekul.Aug24Batch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByNameEquals(String name);

    Student findByNameAndAddress(String name, String address);

    List<Student> findDistinctByNameAndAddress(String name, String address);

    List<Student> findByDobBetween(LocalDate startDate, LocalDate endDate);
    List<Student> findByHeightLessThan(Integer height);
}
