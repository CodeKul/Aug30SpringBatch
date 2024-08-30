package com.codekul.Aug24Batch;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {

    @Id
    private Long id;

    private String test;

}
