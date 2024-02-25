package org.example;


import jakarta.persistence.*;

//One to One Relationship
@Entity
@Table(name="student")
public class Student1 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true ,fetch = FetchType.LAZY)
    private Tution tution;

    public Student1() {
        super();
    }

    public Student1(int id, String name, Tution tution) {
        super();
        this.id = id;
        this.name = name;
        this.tution = tution;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tution=" + tution +
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

    public Tution getTution() {
        return tution;
    }

    public void setTution(Tution tution) {
        this.tution = tution;
    }
}
