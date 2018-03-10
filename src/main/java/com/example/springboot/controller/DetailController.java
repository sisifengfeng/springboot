package com.example.springboot.controller;

import com.example.springboot.domain.Detail;
import com.example.springboot.service.DetailService;
import com.example.springboot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DetailController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private DetailService detailService;
    @RequestMapping("toAddBug")
    public String toAddBug(Model model){
        model.addAttribute("projects",projectService.list());
        return "addBug";
    }
    @RequestMapping("addBug")
    public String addBug(Detail detail){
        detailService.save(detail);
        return "redirect:/";
    }
    @RequestMapping("getByProjectId")
    public String getByProjectId(Model model,Integer projectId){
        model.addAttribute("projects",projectService.list());
        model.addAttribute("details",detailService.listByProjectId(projectId));
        model.addAttribute("pId",projectId);
        return "home";
    }
}
