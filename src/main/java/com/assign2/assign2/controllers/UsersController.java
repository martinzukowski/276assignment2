package com.assign2.assign2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.assign2.assign2.models.Users;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        System.out.println("Get all users");
        // todo: get all users from the database
        List<Users> users = new ArrayList<>();
        users.add(new Users("John", "password", 10));
        users.add(new Users("Jane", "password", 20));
        users.add(new Users("Doe", "password", 30));
        users.add(new Users("Smith", "password", 40));
        // end of database call
        model.addAttribute("us", users);
        return "users/showAll";
    }
    
}
