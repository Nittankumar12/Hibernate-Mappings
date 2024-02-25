package org.example;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.util.*;
import java.util.ArrayList;

public class ManytoMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Student3 student3 = new Student3();
        student3.setName("vishal");
        Student3 student31 = new Student3();
        student31.setName("amit");

        Subject subject1 = new Subject();
        subject1.setName("Math");
        Subject subject2 = new Subject();
        subject2.setName("English");

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);

        List<Student3> student3List = new ArrayList<>();
        student3List.add(student3);
        student3List.add(student31);

        subject1.setStudents(student3List);
        subject2.setStudents(student3List);
//        student3.setSubjects(subjectList);
//        student31.setSubjects(subjectList);

        session.save(student31);
        session.save(student3);
        session.save(subject1);
        session.save(subject2);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
