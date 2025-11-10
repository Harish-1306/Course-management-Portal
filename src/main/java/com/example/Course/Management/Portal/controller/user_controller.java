package com.example.Course.Management.Portal.controller;

import com.example.Course.Management.Portal.model.user_details;
import com.example.Course.Management.Portal.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class user_controller {
    @Autowired
    user_service service;

    @PostMapping("/add_user")
    public String adduser(@RequestBody user_details user){
      return  service.adduser(user);
    }
    @PostMapping("/update_user")
    public String updateuser(@RequestBody user_details user){
        return service.updateuser(user);
    }

    @PostMapping("/validate_user")
    public boolean Validate_user(@RequestBody user_details user){
        return service.Validate_user(user);

    }
}
