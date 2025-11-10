package com.example.Course.Management.Portal.service;

import com.example.Course.Management.Portal.model.Course_Registry;
import com.example.Course.Management.Portal.repository.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseRegistryService {
    @Autowired
    CourseRegistryRepo courseRegrepo;
    public String registrcourse(Course_Registry courseregistry) {
        String email1 = courseregistry.getEmailid();
        if (!email1.contains("@gmail.com")) {
            email1 = email1 + "@gmail.com";
        }
        courseregistry.setEmailid(email1);


        courseRegrepo.save(courseregistry);
    return "Congratulations "+courseregistry.getName()+" you registered your "+courseregistry.getCoursename()+" course successfully";
    }

    public List<Course_Registry> enrolledcourses() {
        return courseRegrepo.findAll();

    }

    public String update_enrolled(String email, Map<String, Object> update) {
        email=email.trim().toLowerCase();
        Course_Registry existing_data=courseRegrepo.findById(email).orElse(null);
        if(existing_data==null) return "Enter the valid email Or user not found with this email";
        update.forEach((String key,Object value)->{
            switch (key.toLowerCase()) {
                case "name":
                    existing_data.setName(value.toString());
                    break;
                case "emailid":
                    existing_data.setEmailid(value.toString());
                   break;
                case "coursename":existing_data.setCoursename(value.toString());break;
                default:break;

            }
        });
                courseRegrepo.save(existing_data);
        return "course details updated successfully for "+email;
    }


    public String clearenrolled() {
        courseRegrepo.deleteAll();
        return "All Enrollments cleared";
    }


}
