package com.codekul.Aug24Batch.manytomany.repository;

import com.codekul.Aug24Batch.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Long> {
}
