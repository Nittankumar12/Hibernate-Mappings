package org.example;

import jakarta.persistence.*;

import java.util.*;
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "subjects")
    private List<Student3> students;

    public Subject() {
        super();
    }

    public Subject(int id, String name, List<Student3> students) {
        super();
        this.id = id;
        this.name = name;
        this.students = students;
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

    public List<Student3> getStudents() {
        return students;
    }

    public void setStudents(List<Student3> students) {
        this.students = students;
    }
}
