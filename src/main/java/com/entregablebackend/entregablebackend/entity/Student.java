package com.entregablebackend.entregablebackend.entity;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth; 

    //Relaciones
    @OneToMany(mappedBy = "student")
    private List<Counseling> counselings;

    //Constructor
    public Student(){

    }

    public Student ( Long id , String name, String email, LocalDate dateOfBirth ){
        this.id=id;
        this.name=name;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
    }

    
    //Metodos de acceso
    // get o Set
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}


