package com.jobportal.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jobportal.jobportal.entity.User;
import com.jobportal.jobportal.entity.UserType;
import com.jobportal.jobportal.service.UserService;
import com.jobportal.jobportal.service.UserTypeService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
    @Autowired
    private UserTypeService userTypeService;
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register(Model model) {
        List<UserType> userTypes = userTypeService.getAll();
        model.addAttribute("getAllTypes", userTypes);
        model.addAttribute("new_user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid User user, Model model) {
        Optional<User> optionalUsers = userService.getUserByEmail(user.getEmail());
        if (optionalUsers.isPresent()) {
            model.addAttribute("error", "Email already registered");
            List<UserType> userTypes = userTypeService.getAll();
            model.addAttribute("getAllTypes", userTypes);
            model.addAttribute("new_user", new User());
            return "register";
        }
        userService.addUser(user);
        return "admin";
    }

}
