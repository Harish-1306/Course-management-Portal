package com.example.Course.Management.Portal.service;

import com.example.Course.Management.Portal.model.Course_Details;
import com.example.Course.Management.Portal.repository.CourseDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseDetailsService {
    @Autowired
    CourseDetailsRepo repo;

    public List<Course_Details> Availablecourses() {
        return repo.findAll();
    }

    public void Addcourse(Course_Details course) {
        repo.save(course);

    }

    public void updatecourse(Course_Details course) {
        repo.save(course);
    }

    public String deleteCourse(String courseId) {
        if(repo.existsById(courseId)) {
            repo.deleteById(courseId);
            return "Course deleted successfully";
        } else {
            return "Course not found with ID: " + courseId;
        }
    }
}
