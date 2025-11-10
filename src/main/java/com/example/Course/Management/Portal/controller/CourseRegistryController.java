package com.example.Course.Management.Portal.controller;


import com.example.Course.Management.Portal.model.Course_Registry;

import com.example.Course.Management.Portal.service.CourseRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class CourseRegistryController {
    @Autowired
    CourseRegistryService courseRegservice;

    @PostMapping("/register")
    public String registercourse(@RequestBody Course_Registry courseregistry){
      return  courseRegservice.registrcourse(courseregistry);
    }


    @GetMapping("/enrolledcourses")
    public List<Course_Registry>  enrolled(){
        return courseRegservice.enrolledcourses();
    }


   @PatchMapping("update_enrolled/{emailid}")
    public String update_enrolled(@PathVariable String emailid,@RequestBody Map<String ,Object > update){
        return courseRegservice.update_enrolled(emailid,update);

    }
    @DeleteMapping("/clear_enrolled")
    public String clearenrolled(){
        return courseRegservice.clearenrolled();
    }

}
