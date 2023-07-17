package com.entregablebackend.entregablebackend.entity;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Program {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;  
    
    //RElations
    @OneToMany(mappedBy = "program")
    private List<Advisor> advisors;
    
    //Constructor
    public Program(){

    }

    public Program ( Long id , String name, String code){
        this.id=id;
        this.name=name;
        this.code=code;        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
    //Metodos de acceso
    // get o Set

    
}


