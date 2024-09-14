package com.codekul.Aug24Batch.manytomany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @ManyToMany()
    @JoinTable(name = "stude_courses",
            joinColumns = {@JoinColumn(name = "stud_id",referencedColumnName = "id")},
            inverseJoinColumns ={@JoinColumn(name = "course_id",referencedColumnName = "id")} )
    private List<Courses> courses;


}
