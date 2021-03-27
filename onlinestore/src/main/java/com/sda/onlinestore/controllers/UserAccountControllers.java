package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.servicies.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserAccountControllers {
@Autowired
private UserAccountService userAccountService;


    @GetMapping(path = "/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping(path = "/register")
    public String getRegiterPage(Model model){
        model.addAttribute("user", new UserAccountEntity());
        return "register";
    }

    @PostMapping("/register/add")
    public String getRegisterPage( @ModelAttribute UserAccountEntity newUser){
        userAccountService.addCustomer(newUser);
        return "redirect:/login";
    }

}
