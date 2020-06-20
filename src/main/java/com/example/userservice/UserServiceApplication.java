package com.example.userservice;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {
    private UserService userService;

    @Autowired
    public UserServiceApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.createUser(new User("John","john@gmail.com"));
        userService.createUser(new User("Marry","marry@gmail.com"));
        userService.createUser(new User("Rahul","rahul@gmail.com"));

    }
}
