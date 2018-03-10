package com.example.springboot.repository;

import com.example.springboot.domain.Detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DetailRepository {
    List<Detail> list();
    List<Detail> listByProjectId(@Param("projectId")Integer projectId);
    void save(Detail detail);
}
