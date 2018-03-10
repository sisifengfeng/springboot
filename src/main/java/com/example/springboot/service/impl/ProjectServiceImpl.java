package com.example.springboot.service.impl;

import com.example.springboot.domain.Project;
import com.example.springboot.repository.ProjectRepository;
import com.example.springboot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> list() {
        return projectRepository.list();
    }
}
