package com.temple.donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.temple.donation.model.User;
import com.temple.donation.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        List<User> users = userRepository.findAll();

        for (User u : users) {
            if (u.getUsername().equals(user.getUsername()) &&
                u.getPassword().equals(user.getPassword())) {
                return "LOGIN_SUCCESS:" + u.getRole();
            }
        }
        return "LOGIN_FAILED";
    }
}