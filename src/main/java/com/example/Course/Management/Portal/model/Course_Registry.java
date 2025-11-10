package com.example.Course.Management.Portal.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;


@Entity

public class Course_Registry {

    private String name;
    @Id
    private String emailid;
    private String coursename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid.trim().toLowerCase();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename.trim().toUpperCase();
    }

    public Course_Registry(String name, String emailid, String coursename) {
        this.name = name;
        this.emailid = emailid;
        this.coursename = coursename;
    }
    public Course_Registry(){}

}
