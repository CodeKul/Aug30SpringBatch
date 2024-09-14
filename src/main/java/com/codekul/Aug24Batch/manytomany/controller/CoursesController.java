package com.codekul.Aug24Batch.manytomany.controller;

import com.codekul.Aug24Batch.manytomany.entity.Courses;
import com.codekul.Aug24Batch.manytomany.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CoursesController {

    @Autowired
    private CourseService courseService;

    @PostMapping("save")
    public String saveCourse(@RequestBody Courses courses) {
        return courseService.saveCourse(courses);
    }
}
