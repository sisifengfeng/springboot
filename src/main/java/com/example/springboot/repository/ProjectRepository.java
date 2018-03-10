package com.example.springboot.repository;

import com.example.springboot.domain.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProjectRepository {
    List<Project> list();
}
