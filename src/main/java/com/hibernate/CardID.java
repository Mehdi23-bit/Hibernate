package com.hibernate;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table(name="CardIDs")
public class CardID {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "expiring date")
private Date expiring;  
@OneToOne
private Student student;
public CardID(Date expiring,Student student){
this.expiring=expiring;
this.student=student;
} 
public CardID(){}
public void setExpiring(Date expiring) {
    this.expiring = expiring;
}
public String toString(){
    return "Card [id: "+this.id+" , expiring: "+this.expiring+" , Student: "+this.student+"]";
}

}
