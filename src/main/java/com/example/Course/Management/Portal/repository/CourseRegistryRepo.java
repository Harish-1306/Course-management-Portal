package com.example.Course.Management.Portal.repository;

import com.example.Course.Management.Portal.model.Course_Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<Course_Registry,String> {
}
