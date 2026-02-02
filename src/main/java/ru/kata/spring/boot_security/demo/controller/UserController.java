package com.serdtsev.spring.boot.springbootproject.controller;

import com.serdtsev.spring.boot.springbootproject.entity.User;
import com.serdtsev.spring.boot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user")
    public String userHome(Principal principal, Model model) {
        User user = userService.findUserByUsername(principal.getName());
        model.addAttribute("user", user);
        return "user-home";
    }
}
