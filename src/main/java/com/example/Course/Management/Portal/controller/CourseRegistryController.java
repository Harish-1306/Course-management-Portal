package com.example.Course.Management.Portal.controller;

import com.example.Course.Management.Portal.model.Course_Details;
import com.example.Course.Management.Portal.model.Course_Registry;
import com.example.Course.Management.Portal.service.CourseDetailsService;
import com.example.Course.Management.Portal.service.CourseRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class CourseRegistryController {
    @Autowired
    CourseRegistryService courseRegservice;

    @PostMapping("/register")
    public String registercourse(Course_Registry courseregistry){
        courseRegservice.registrcourse(courseregistry);
        return String.format(
                "<h2 align='center' style=\"background-color: aqua; margin-top:100px;\">Congratulations %s! You have successfully registered for the %s course.</h2>",
                courseregistry.getName(),
                courseregistry.getCoursename()
        );
    }


    @GetMapping("/enrolledcourses")
    public List<Course_Registry>  enrolled(){
        return courseRegservice.enrolledcourses();
    }


    @PutMapping("/updateregistry")
    public String updateregistry( @RequestBody Course_Registry courseregistry){
        courseRegservice.updateregistry(courseregistry);
        return "updated successfully";

    }

}
