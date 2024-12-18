package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="courses")
public class Course {
    @Id
    private int id;
    private String name;
    @OneToMany
    private List<Student> students;
    public Course(String name){
        this.name=name;
        this.students=new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

}
