package com.example.Course.Management.Portal.controller;

import com.example.Course.Management.Portal.model.Course_Details;
import com.example.Course.Management.Portal.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class CourseDetailController {
    @Autowired
    CourseDetailsService courseService;


    @GetMapping("/view_course_details")
    public List<Course_Details> Availablecourses(){
        return courseService.Availablecourses();
    }

    @PostMapping("/add_course_details")
    public String Addcourse(@RequestBody Course_Details course){
       return courseService.Addcourse(course);

    }

    @PatchMapping("/update_course/{course_id}")
    public String partiallyUpdateCourse(@PathVariable String course_id, @RequestBody Map<String, Object> updates) {
        return courseService.partialUpdateCourse(course_id, updates);
    }

    @DeleteMapping("/delete/{course_id}")
    public String deletecourse(@PathVariable String course_id) {
        return courseService.deleteCourse(course_id);
    }
    @DeleteMapping("/delete_all")
    public String deleteall(){
      return  courseService.deleteall();

    }
}
