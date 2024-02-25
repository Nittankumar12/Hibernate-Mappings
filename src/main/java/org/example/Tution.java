package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "tution")
public class Tution {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // no need of using generatedValue when we are using mapsid

    private int id;
    private Double fee;
    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "student_id")
    // joincolumn annotation will create a seperate student id column

    //MapsId tells hibernate to make foriegn key of tution as a primary key of tution table
    @MapsId
    private Student1 student;

    public Tution() {
        super();
    }

    public Tution(int id, Double fee, Student1 student) {
        super();
        this.id = id;
        this.fee = fee;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Student1 getStudent() {
        return student;
    }

    public void setStudent(Student1 student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Tution{" +
                "id=" + id +
                ", fee=" + fee +
                ", student=" + student +
                '}';
    }
}
