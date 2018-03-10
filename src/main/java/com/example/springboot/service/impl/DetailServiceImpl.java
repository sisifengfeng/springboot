package com.example.springboot.service.impl;

import com.example.springboot.domain.Detail;
import com.example.springboot.repository.DetailRepository;
import com.example.springboot.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@Service
@Transactional
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailRepository detailRepository;

    @Override
    public List<Detail> list() {
        return detailRepository.list();
    }

    @Override
    public List<Detail> listByProjectId(Integer projectId) {
        return detailRepository.listByProjectId(projectId);
    }

    @Override
    public void save(Detail detail) {
        detailRepository.save(detail);
    }
}
