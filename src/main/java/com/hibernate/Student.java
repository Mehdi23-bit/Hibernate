package com.hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "student")
    private CardID card;
    @ManyToOne
    private Course course;
    
    public Student() {}
    public Student(String name, String email,CardID card,Course course) {
        this.name = name;
        this.email = email;
        this.card=card;
        this.course=course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setCard(CardID card) {
        this.card = card;
    }
    public CardID getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}

