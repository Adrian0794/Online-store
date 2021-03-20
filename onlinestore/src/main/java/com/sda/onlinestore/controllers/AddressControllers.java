package com.sda.onlinestore.controllers;


import com.sda.onlinestore.entities.AddressEntity;
import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.servicies.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AddressControllers {
    @Autowired
    private AddressService addressService;

    @GetMapping(path = "getAddress")
    public String getAddress(Model model) {
        List<AddressEntity> addressList = addressService.addressAllList();
        model.addAttribute("address", addressList);
        return "address";
    }

}
