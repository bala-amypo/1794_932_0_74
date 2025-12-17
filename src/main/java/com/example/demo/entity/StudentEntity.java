package com.example.demo.entity;


import jakarata.persistence.Entity;

@Entity
public class StudentEntity{

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}