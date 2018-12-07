package com.quiz.service;

import com.quiz.model.User;
import com.quiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }
    public List<User> saveUser( User user){
        userRepository.save(user);
        return userRepository.findAll();
    }
}
