package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OnetoManyBi {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        University university = new University();
        university.setName("Manav Rachna University");

        Student2 student2 = new Student2();
        student2.setName("Dinesh");

        Student2 student21 = new Student2();
        student21.setName("Aman");
        student21.setUniversity(university);
        student2.setUniversity(university);
        List<Student2> students = new ArrayList<>();
        students.add(student21);
        students.add(student2);
        university.setStudentList(students);


        session.save(university);
        session.getTransaction().commit();
        session.close();
    }
}
