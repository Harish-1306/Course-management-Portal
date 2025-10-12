package com.example.Course.Management.Portal.controller;

import com.example.Course.Management.Portal.model.Course_Details;
import com.example.Course.Management.Portal.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseDetailController {
    @Autowired
    CourseDetailsService courseService;


    @GetMapping("/viewcoursedetails")
    public List<Course_Details> Availablecourses(){
        return courseService.Availablecourses();
    }

    @PostMapping("/addcoursedetails")
    public String Addcourse(@RequestBody Course_Details course){
        courseService.Addcourse(course);
        return "course added successfully";
    }

    @PutMapping("/updatedetails")
    public String updatedcourse(@RequestBody Course_Details course){
        courseService.updatecourse(course);
        return "course updated successfully";
    }
    @DeleteMapping("/delete/{course_id}")
    public String deletecourse(@PathVariable String course_id){
        courseService.deleteCourse(course_id);
        return "deleted successfully";
    }
}
