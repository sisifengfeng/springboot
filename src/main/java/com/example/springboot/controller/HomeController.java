package com.example.springboot.controller;

import com.example.springboot.service.DetailService;
import com.example.springboot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private DetailService detailService;
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("projects", projectService.list());
        model.addAttribute("details", detailService.list());
        return "home";
    }
}
