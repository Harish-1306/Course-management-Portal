package com.example.Course.Management.Portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course_Details {
    @Id
    private String Course_id;
    private String Course_name;
    private String Trainer;
    private int Duration_in_weeks;

    public Course_Details(String course_id, String course_name, String trainer, int duration_in_weeks) {
        Course_id = course_id;
        Course_name = course_name;
        Trainer = trainer;
        Duration_in_weeks = duration_in_weeks;
    }

    public Course_Details() {
    }
}
