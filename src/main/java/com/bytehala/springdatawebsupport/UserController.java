package com.bytehala.springdatawebsupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable("id") User user) {
        return user;
    }

    // Allows us to call /users?page=0&size=2
    @GetMapping("/users")
    public Page<User> findAllUsers(@RequestParam("page") int page,
                                   @RequestParam("size") int size, Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @GetMapping("/sortedusers")
    public Page<User> findAllUsersSortedByName(@SortDefault(sort = "name",
            direction = Sort.Direction.ASC) Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}