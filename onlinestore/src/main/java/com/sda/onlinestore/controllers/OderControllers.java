package com.sda.onlinestore.controllers;

import com.sda.onlinestore.servicies.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OderControllers {

    @Autowired
    private OrderService orderService;
}
