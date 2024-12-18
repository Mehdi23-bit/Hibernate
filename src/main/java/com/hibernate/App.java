package com.hibernate;
import jakarta.persistence.GenerationType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import java.sql.Date;

// import com.mysql.cj.xdevapi.SessionFactory;

public class App {
    public static void main(String[] args) {
       
       Configuration config=new Configuration().configure();
        
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
       
Student student1=session.get(Student.class,1);
session.evict(student1);

Student student2=session.get(Student.class,1);
System.out.println(student1==student2);
       
        tx.commit();
       
    }
}

