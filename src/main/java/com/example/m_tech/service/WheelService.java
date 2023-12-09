package com.example.m_tech.service;

import com.example.m_tech.model.Wheel;
import com.example.m_tech.repo.WheelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WheelService {
    @Autowired
    private WheelRepo wheelRepo;
    public List<Wheel> getAll() {
        return wheelRepo.getAllBy();
    }
}
