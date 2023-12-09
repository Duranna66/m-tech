package com.example.m_tech.service;

import com.example.m_tech.model.Car;
import com.example.m_tech.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    public Car getCar(Long id) {
        return carRepo.findCarById(id);
    }
    public Car save(Car car) {
        if(car.getCountOfWheels() < 2) {
            return null;
        }
        return carRepo.save(car);
    }
    public List<Car> getAllCars() {
        return carRepo.findAllBy();
    }
}
