package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.servicies.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path = "getUser")
    public String getUserAccount(Model model){
        List<UserAccountEntity> userAccountList = userAccountService.userAccountAllList();
        model.addAttribute("userAccounts", userAccountList );
        return "userAccount";
    }

    @GetMapping(path = "add-user")
    public String addUserAccountPage(Model model){
        model.addAttribute("newUserAccount", new UserAccountEntity());
        return "add-userAccount";
    }
    @PostMapping(path = "userAccount/add")
    public String addUserAccount(@ModelAttribute UserAccountEntity newUserAccount){
        userAccountService.addUser(newUserAccount);
        return "redirect:/getUser";
    }
}
