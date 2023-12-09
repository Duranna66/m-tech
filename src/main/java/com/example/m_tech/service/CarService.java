package com.example.m_tech.service;

import com.example.m_tech.model.Car;
import com.example.m_tech.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    public Car getCar() {
        return carRepo.findCarById(1L);
    }
    public Car save(Car car) {
        return carRepo.save(car);
    }
}
