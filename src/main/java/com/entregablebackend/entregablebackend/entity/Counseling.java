package com.entregablebackend.entregablebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Counseling {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	
	
    //Relaciones
    @ManyToOne  
    @JoinColumn(name="advisor_id")
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    public Counseling(Long id, Advisor advisor, Student student) {
        this.id = id;
        this.advisor = advisor;
        this.student = student;
    }

    public Counseling() {
    }

    public Counseling(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
    
}
