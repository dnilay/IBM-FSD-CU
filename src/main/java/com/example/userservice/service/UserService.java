package com.example.userservice.service;

import com.example.userservice.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public  User createUser(User user);
}
