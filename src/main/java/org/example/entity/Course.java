package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseID;
    @Column(name = "course_name")
    private String courseName;
    @Enumerated(EnumType.STRING)
    @Column(name = "course_type")
    private CourseType courseType;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id_fk")
    private Instructor instructor;

}
