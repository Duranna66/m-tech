package com.example.m_tech.controllers;

import com.example.m_tech.model.Body;
import com.example.m_tech.model.Car;
import com.example.m_tech.model.Wheel;
import com.example.m_tech.service.BodyService;
import com.example.m_tech.service.CarService;
import com.example.m_tech.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private CarService carService;
    @Autowired
    private BodyService bodyService;
    @Autowired
    private WheelService wheelService;
    @GetMapping("/getCars")
    public List<Car> get() {
        return carService.getAllCars();
    }
    @GetMapping("/bodies")
    public List<Body> getAllCarBody() {
        return bodyService.getAllBody();
    }
    @GetMapping("/wheels")
    public List<Wheel> getAllCarWheel() {
        return wheelService.getAll();
    }
    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car) {
        System.out.println(car);
        return carService.save(car);
    }
    @GetMapping("/getAllCarInformation/{id}")
    public Car getCarById(@ModelAttribute("id") Long id) {
        return carService.getCar(id);
    }

}
