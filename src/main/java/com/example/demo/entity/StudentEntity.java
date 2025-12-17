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

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
     
     public void setEmail(String email){
        this.email=email;
    }

    public String getName(){
        return this.name;
    }


}