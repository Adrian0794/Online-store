package com.sda.onlinestore.controller;

import com.sda.onlinestore.servicies.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OderController {

    @Autowired
    private OrderService orderService;
}
