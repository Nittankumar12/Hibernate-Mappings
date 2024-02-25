package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="student1")

// INHERITANCE 1: TABLE PER HIERARCHY
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value="student")

//INHERITANCE 2: TABLE PER CONCRETE CLASS
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "city")
    private String city;

    public Student(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student() {
        super();
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
