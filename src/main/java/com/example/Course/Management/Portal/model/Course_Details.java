package com.example.Course.Management.Portal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity


public class Course_Details {
    @Id

    private String Course_id;
    private String Course_name;
    private String Trainer;
    private int Duration_in_weeks;

    public void setCourse_id(String course_id) {
        Course_id = course_id.toUpperCase();
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name.toUpperCase();
    }

    public void setTrainer(String trainer) {
        Trainer = trainer.toUpperCase();
    }

    public void setDuration_in_weeks(int duration_in_weeks) {
        Duration_in_weeks = duration_in_weeks;
    }

    public String getCourse_id() {
        return Course_id;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public String getTrainer() {
        return Trainer;
    }

    public int getDuration_in_weeks() {
        return Duration_in_weeks;
    }

    public Course_Details(String course_id, String course_name, String trainer, int duration_in_weeks) {
        Course_id = course_id;
        Course_name = course_name;
        Trainer = trainer;
        Duration_in_weeks = duration_in_weeks;
    }

    public Course_Details() {
    }
}
