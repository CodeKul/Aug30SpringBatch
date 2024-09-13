package com.codekul.Aug24Batch.onetoone.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserDetails { //owing side

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String passcode;

    private String mobileNumber;

    @OneToOne
    @JoinColumn(name = "user_id")//this is foreign key
    @JsonBackReference
    private Users user;
}
