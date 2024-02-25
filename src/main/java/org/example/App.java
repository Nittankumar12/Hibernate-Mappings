package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App
{
    public static void main( String[] args ) throws IOException {

        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();

        Student student = new Student();
        student.setCity("LONDON");
//        student.setId(106);
        student.setName("AMAN");
        System.out.println(student);

        Address address = new Address();
        address.setStreet("STREET1");
//        address.setCity("DELHI");
        address.setAddedDate(new Date());
        address.setX(123.45);
        address.setOpen(true);

        Course course = new Course();
//        course.setCourse_id(13445432);
        course.setCourse_name("English");
        course.setCourse_startDate(new Date());
        course.setCourse_endDate(new Date());
        course.setCourse_marks(100);

//        FileInputStream fis = new FileInputStream("src/main/xavier.png");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        address.setImage(data);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(address);
      session.save(course);
        session.save(student);
//        session.persist(address);
//        session.persist(student);
        transaction.commit();
        session.close();
        System.out.println("Done");

    }
}
