package com.example.Course.Management.Portal.repository;

import com.example.Course.Management.Portal.model.user_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends JpaRepository<user_details,String> {
}
