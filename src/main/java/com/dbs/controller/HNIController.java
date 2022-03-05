package com.dbs.controller;

import com.dbs.services.HNIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HNIController {
    @Autowired
    private HNIService hniService;
    @GetMapping("/hni")
    public String getHNIS(Model model){
        model.addAttribute("hnis",hniService.findAll());
        return "wealth_manager/viewHNI";
    }
}
