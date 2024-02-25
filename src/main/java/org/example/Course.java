package org.example;

import jakarta.persistence.*;

import java.util.Date;

//@Entity
//@DiscriminatorValue("course")
//
//
//@Table(name = "course")
//@AttributeOverrides({
//        @AttributeOverride(name="id", column = @Column(name = "id")),
//        @AttributeOverride(name = "name", column = @Column(name="name")),
//        @AttributeOverride(name = "city", column = @Column(name = "city"))
//})

@Embeddable
public class Course{

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;
//    @Column(nullable = false)
    private String course_name;
    private Date course_startDate;
    @Temporal(TemporalType.DATE)
    private Date course_endDate;
    @Temporal(TemporalType.DATE)
    private int course_marks;


    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", course_startDate=" + course_startDate +
                ", course_endDate=" + course_endDate +
                ", course_marks=" + course_marks +
                '}';
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Date getCourse_startDate() {
        return course_startDate;
    }

    public void setCourse_startDate(Date course_startDate) {
        this.course_startDate = course_startDate;
    }

    public Date getCourse_endDate() {
        return course_endDate;
    }

    public void setCourse_endDate(Date course_endDate) {
        this.course_endDate = course_endDate;
    }

    public int getCourse_marks() {
        return course_marks;
    }

    public void setCourse_marks(int course_marks) {
        this.course_marks = course_marks;
    }

    public Course() {
        super();
    }
    public Course(int course_id, String course_name, Date course_startDate, Date course_endDate, int course_marks) {
        super();
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_startDate = course_startDate;
        this.course_endDate = course_endDate;
        this.course_marks = course_marks;
    }
}
