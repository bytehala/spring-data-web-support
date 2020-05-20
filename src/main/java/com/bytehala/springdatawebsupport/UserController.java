package com.bytehala.springdatawebsupport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable("id") User user) {
        return user;
    }
}