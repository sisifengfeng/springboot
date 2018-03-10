package com.example.springboot.service;

import com.example.springboot.domain.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailService {
    List<Detail> list();
    List<Detail> listByProjectId(@Param("projectId")Integer projectId);
    void save(Detail detail);
}
