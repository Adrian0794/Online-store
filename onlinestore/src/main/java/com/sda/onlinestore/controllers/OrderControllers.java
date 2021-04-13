package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.servicies.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class OrderControllers {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "getOrder")
    public String getOrder(Model model) {
        List<OrderEntity> orderList = orderService.getAllOrders();
        model.addAttribute("orders", orderList);
        return "order";
    }

    @GetMapping(path = "addToCart/{userId}/{productId}")
    public String addToCart(Model model, @PathVariable("userId") Integer userId, @PathVariable("productId") Integer productId) {
        orderService.addToCart(userId, productId);
        return "orders.html";
    }

//    @GetMapping(path = "addToCart/{userName}/{productId}")
//    public String addToCart(Model model, @PathVariable("userId") String userName, @PathVariable("productId") Integer productId) {
//        orderService.addToCart(userName, productId);
//        return "orders.html";
//    }
    //delete

    @GetMapping(path = "delete-order/{id}")
    public String deleteOrder(Model model, @PathVariable("id") Integer id) {
        orderService.deleteOrder(id);
        return "redirect:/getOrder";
    }
}