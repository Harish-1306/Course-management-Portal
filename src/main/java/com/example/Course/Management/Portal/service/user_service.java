package com.example.Course.Management.Portal.service;

import com.example.Course.Management.Portal.model.user_details;
import com.example.Course.Management.Portal.repository.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user_service {
    @Autowired
    userrepo repo;
    public String adduser(user_details user) {

        if(repo.existsById(user.getUsername()))
        { return "username already exists";
        }
        else {
            repo.save(user);
            return "user added successfully";
        }
    }


    public boolean Validate_user(user_details user) {
        user_details existingUser = repo.findById(user.getUsername()).orElse(null);
        return  existingUser != null && existingUser.getPassword().equals(user.getPassword());

    }

    public String updateuser(user_details user) {
        repo.save(user);
        return "!!!User details updated successfully";
    }
}
