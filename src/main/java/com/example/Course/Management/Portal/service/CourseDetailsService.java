package com.example.Course.Management.Portal.service;

import com.example.Course.Management.Portal.model.Course_Details;
import com.example.Course.Management.Portal.repository.CourseDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseDetailsService {
    @Autowired
    CourseDetailsRepo repo;

    public List<Course_Details> Availablecourses() {
        return repo.findAll();
    }

    public String Addcourse(Course_Details course) {

        if(repo.existsById(course.getCourse_id())){
            return "Course with this Id already exists";
        }
        else{
            repo.save(course);
            return "Course Added Successfully";
        }

    }

    public String partialUpdateCourse(String courseId, Map<String, Object> updates) {
        courseId = courseId.trim().toUpperCase();

        Course_Details existingCourse = repo.findById(courseId).orElse(null);
        if (existingCourse == null) {
            return "Course not found with ID: " + courseId;
        }

        updates.forEach((key, value) -> {
            switch (key.toLowerCase()) {
                case "course_name":
                    existingCourse.setCourse_name(value.toString());
                    break;
                case "trainer":
                    existingCourse.setTrainer(value.toString());
                    break;
                case "duration_in_weeks":
                    existingCourse.setDuration_in_weeks(Integer.parseInt(value.toString()));
                    break;
                default:

                    break;
            }
        });

        repo.save(existingCourse);
        return "Course details updated successfully for ID: " + courseId;
    }


    public String deleteCourse(String courseId) {
        courseId = courseId.trim().toUpperCase();

        if(repo.existsById(courseId)) {
            repo.deleteById(courseId);
            return "Course deleted successfully";
        }
        else {
            return "Course not found with ID: " + courseId;
        }
    }

    public String deleteall() {
        repo.deleteAll();
        return "All the records are deleted successfully";
    }

}
