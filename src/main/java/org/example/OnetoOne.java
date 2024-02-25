package org.example;

import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOne {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session sesssion = sessionFactory.openSession();
        sesssion.beginTransaction();

        Student1 student1 = new Student1();
        student1.setName("Nittan");

        Tution tution = new Tution();
        tution.setFee(200.00);
        tution.setStudent(student1);
        student1.setTution(tution);

        sesssion.save(student1);
        sesssion.getTransaction().commit();
        sesssion.close();

    }
}

