package org.example;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private String name;

    // FOR ONE TO MANY BIDIRECTIONAL
//    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL,orphanRemoval = true)

    // FOR ONE TO MANY UNIDIRECTIONAL
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)

    // FOR BOTH UNI AND BI DIRECTIONAL
    @JoinColumn(name = "university_id")
    private List<Student2> studentList;

    public University() {
        super();
    }

    public University(int id, String name, List<Student2> studentList) {
        super();
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
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

    public List<Student2> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student2> studentList) {
        this.studentList = studentList;
    }
}
