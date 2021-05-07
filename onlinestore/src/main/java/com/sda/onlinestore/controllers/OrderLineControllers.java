package com.sda.onlinestore.controllers;


import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.servicies.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderLineControllers {

    @Autowired
    private OrderLineService orderLineService;

    public String getOrderLine(Model model) {
        List<OrderLineEntity> orderLineEntityList = orderLineService.orderLineList();
        model.addAttribute("orderLines", orderLineEntityList);
        return "orderLine";

    }


    @GetMapping(path = "delete-orderline/{id}")
    public String deleteOrderLine(Model model, @PathVariable("id") Integer id) {
        orderLineService.deleteOrderLineById(id);
        return "redirect:/getOrderLine";
    }

    @PostMapping(path = "orderLine/edit")
    public String editOrderLine(@ModelAttribute OrderLineEntity orderLineToBeEdit) {
        orderLineService.editOrderline(orderLineToBeEdit);
        return "redirect:/getOrderLine";
    }

}
