package com.codekul.Aug24Batch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findByName(String name);

    @Query
    Student findByNameAndAddress(String name,String address);
}
