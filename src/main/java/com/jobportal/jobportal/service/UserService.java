package com.jobportal.jobportal.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.User;

@Service
public interface UserService {
    public User addUser(User user);

    public Optional<User> getUserByEmail(String email);
}
