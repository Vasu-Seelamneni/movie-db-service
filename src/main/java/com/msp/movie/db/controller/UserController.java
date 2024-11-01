package com.msp.movie.db.controller;

import com.msp.movie.db.model.User;
import com.msp.movie.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

}
