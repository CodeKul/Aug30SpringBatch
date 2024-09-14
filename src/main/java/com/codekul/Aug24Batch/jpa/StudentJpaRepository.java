package com.codekul.Aug24Batch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentJpaRepository extends JpaRepository<StudentJpa, Long> {

    StudentJpa findByNameEquals(String name);

    StudentJpa findByNameAndAddress(String name, String address);

    List<StudentJpa> findDistinctByNameAndAddress(String name, String address);

    List<StudentJpa> findByDobBetween(LocalDate startDate, LocalDate endDate);
    List<StudentJpa> findByHeightLessThan(Integer height);
}
