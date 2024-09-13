package com.codekul.Aug24Batch.onetomany.repository;

import com.codekul.Aug24Batch.onetomany.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
