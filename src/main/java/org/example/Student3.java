package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student3")
public class Student3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "student_subject",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "subject_id")}
    )
    private List<Subject> subjects;

    public Student3() {
        super();
    }

    public Student3(int id, String name, List<Subject> subjects) {
        super();
        this.id = id;
        this.name = name;
        this.subjects = subjects;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
