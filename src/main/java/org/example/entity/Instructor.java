package org.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "INSTRUCTOR_TABLE")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "instructor_id")
    private int instructorID;
    @Column(name = "instructor_name")
    private String instructorName;
    @Column(name = "instructor_type")
    @Enumerated(EnumType.STRING)
    private InstructorType instructorType;
    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY,mappedBy = "instructor")
    private List<Course> courses;
    public Instructor() {
    }


}
