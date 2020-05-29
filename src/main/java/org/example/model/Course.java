package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseID;
    @Column(name = "course_name")
    private String courseName;
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinTable(name = "course_student",
            joinColumns =@JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(Student theStudent) {

        if (students == null) {
            students = new ArrayList<>();
        }

        students.add(theStudent);
    }
}
