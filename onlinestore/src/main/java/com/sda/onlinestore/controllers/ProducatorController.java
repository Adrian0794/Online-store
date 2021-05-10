package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.ProducatorEntity;
import com.sda.onlinestore.servicies.ProducatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProducatorController {

    @Autowired
    private ProducatorService producatorService;

    @GetMapping(path = "getProducator")
    public String getProducator(Model model) {
        List<ProducatorEntity> producatorList = producatorService.producatorList();
        model.addAttribute("producatori", producatorList);
        return "producator";
    }

    @GetMapping(path = "add-producator")
    public String addProducatorPage(Model model) {
        model.addAttribute("newProducator", new ProducatorEntity());
        return "add-producator";
    }

    @PostMapping(path = "producator/add")
    public String addProducator(@ModelAttribute ProducatorEntity newProducator) {
        producatorService.addProducator(newProducator);
        return "redirect:/getProducator";
    }

    //delete
    @GetMapping(path = "delete-producator/{id}")
    public String deleteProducator(Model model, @PathVariable("id") Integer id) {
        producatorService.deleteProducatorById(id);
        return "redirect:/getProducator";
    }

}
