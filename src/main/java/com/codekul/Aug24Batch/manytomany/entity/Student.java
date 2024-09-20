package com.codekul.Aug24Batch.manytomany.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name cannot be null")
    @Column(unique = true)
    private String name;

    @NotNull(message = "address cannot be null")
    private String address;

    @Min(value = 10)
    private int age;

    @ManyToMany()
    @JoinTable(name = "stude_courses",
            joinColumns = {@JoinColumn(name = "stud_id",referencedColumnName = "id")},
            inverseJoinColumns ={@JoinColumn(name = "course_id",referencedColumnName = "id")} )
    private List<Courses> courses;


}
