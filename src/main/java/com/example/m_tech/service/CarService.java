package com.example.m_tech.service;

import com.example.m_tech.model.Car;
import com.example.m_tech.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    @Cacheable("cars")
    public Car getCar(Long id) {
        return carRepo.findCarById(id);
    }
    @CacheEvict("cars")
    public Car save(Car car) {
        if(car.getCountOfWheels() < 2) {
            return null;
        }
        return carRepo.save(car);
    }
    public List<Car> getAllCars(int pageNo, int pageSize) {
        PageRequest pageable = PageRequest.of(pageNo, pageSize);
        Page<Car> carPage = carRepo.findAll(pageable);
        return carPage.stream().toList();
    }
}
