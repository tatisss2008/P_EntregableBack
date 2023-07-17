package com.entregablebackend.entregablebackend.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Advisor {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;

    //Relaciones
    @ManyToOne
    @JoinColumn(name="program_id")
    private Program program;

    @OneToMany (mappedBy = "advisor")
    private List<Counseling> counseling;


    //7Constructior
    public Advisor() {
    }

 
    //Set y Get
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
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
    public void setPhone(String phone) {
        this.phone = phone;
    }   
    
    public Program getProgram() {
        return program;
    }


    public void setProgram(Program program) {
        this.program = program;
    }


    public void setCounseling(List<Counseling> counseling) {
        this.counseling = counseling;
    }


    
}
