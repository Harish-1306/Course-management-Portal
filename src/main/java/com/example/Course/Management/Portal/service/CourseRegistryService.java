package com.example.Course.Management.Portal.service;

import com.example.Course.Management.Portal.model.Course_Registry;
import com.example.Course.Management.Portal.repository.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistryService {
    @Autowired
    CourseRegistryRepo courseRegrepo;
    public void registrcourse(Course_Registry courseregistry) {
        String email1 = courseregistry.getEmailid();
        if (!email1.contains("@gmail.com")) {
            email1 = email1 + "@gmail.com";
        }
        courseregistry.setEmailid(email1);


        courseRegrepo.save(courseregistry);}

    public List<Course_Registry> enrolledcourses() {
        return courseRegrepo.findAll();

    }

    public void updateregistry(Course_Registry courseregistry) {
        courseRegrepo.save(courseregistry);
    }


}
