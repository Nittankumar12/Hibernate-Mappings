package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = (Student) session.load(Student.class,3);
        Student student2 = (Student) session.get(Student.class,3);
        System.out.println(student);
        System.out.println(student2.getCity() + " " + student2.getName() + " " + student2.getId());





        session.close();
        sessionFactory.close();
    }
}
