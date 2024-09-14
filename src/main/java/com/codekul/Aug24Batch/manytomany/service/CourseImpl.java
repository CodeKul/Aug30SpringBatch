package com.codekul.Aug24Batch.manytomany.service;

import com.codekul.Aug24Batch.manytomany.entity.Courses;
import com.codekul.Aug24Batch.manytomany.repository.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImpl implements CourseService {

    @Autowired
    private CoursesRepo coursesRepo;

    @Override
    public String saveCourse(Courses courses) {
        coursesRepo.save(courses);
        return "course saved";
    }
}
