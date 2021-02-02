package com.wordy.rest.controller;


import com.wordy.rest.entity.User;
import com.wordy.rest.exception_handling.NoSuchUserException;
import com.wordy.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Map<String, Object> showAllUsers(@RequestParam(defaultValue = "1") int page,
                                            @RequestParam(defaultValue = "10") int count) {
        Map<String, Object> resultMap = new HashMap<>();
        List<User> allUsers = userService.getAllUsers(page, count);

        long usersCount = userService.usersCount();

        resultMap.put("items", allUsers);
        resultMap.put("totalCount", usersCount);

        return resultMap;
    }


    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = userService.getUser(id);

        if (user == null) {
            throw new NoSuchUserException("There is no user with ID = " + id + " in a DataBase");
        }

        return user;
    }


    @PostMapping("/users")
    public void addNewUser(@RequestBody User user) {
        userService.saveUser(user);
    }


    @PutMapping("/users")
    public String updateEmployee(@RequestBody User user) {

        userService.saveUser(user);

        return "User's info has been updated";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        User user = userService.getUser(id);

        if (user == null) {
            throw new NoSuchUserException("There is no user with ID = " + id + " in a DataBase");
        }

        userService.deleteUser(id);
        return "Employee with ID = " + id + " has been deleted";
    }
}
