package com.example.m_tech.service;

import com.example.m_tech.model.Body;
import com.example.m_tech.repo.BodyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyService {
    @Autowired
    private BodyRepo bodyRepo;
    public List<Body> getAllBody() {
        return bodyRepo.getBodiesBy();
    }
    public Body getBodyById(Long id) {
        return bodyRepo.findBodyById(id);
    }
}
