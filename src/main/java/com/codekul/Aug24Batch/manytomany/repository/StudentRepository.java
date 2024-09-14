package com.codekul.Aug24Batch.manytomany.repository;

import com.codekul.Aug24Batch.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
