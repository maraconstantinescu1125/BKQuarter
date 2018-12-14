package com.quiz.controller;

import com.quiz.model.User;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value="/all")
    public List<User> getAll(){
        return userService.getUsers();
    }

    @PostMapping(value="/post")
    public List<User> persist(@RequestBody final User user){
        userService.saveUser(user);
        return userService.getUsers();
    }

    @GetMapping(value="userById/{id}")
    public Optional<User> getUserById(@PathVariable("id") int id){
        return userService.findById(id);
    }


}
