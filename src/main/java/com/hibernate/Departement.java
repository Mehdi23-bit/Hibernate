package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Departements")
public class Departement {
    @Id
    private int id;
    @Column(name="nom")
    private String name;
    public Departement(String name){
this.name=name;
    } 
    public String toString(){
        return "Departement "+"[ id : "+this.id+" nom : "+this.name+" ]";
    } 
    }
