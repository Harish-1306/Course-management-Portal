package com.example.Course.Management.Portal.repository;

import com.example.Course.Management.Portal.model.Course_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepo extends JpaRepository<Course_Details,String> {
}
