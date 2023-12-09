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
    @GetMapping("/getCar")
    public String get() {
//        Car car = new Car();
//        carService.save(car);
//        System.out.println(carService.getCar());
        return "Hello";
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
    public String getCarById(@ModelAttribute("id") Long id) {
        Car car = carService.getCar(id);
        String info = String.format("id: %s name: %s body:{id: %s, type: %s, color: %s}", car.getId(), car.getName(), car.getBody_id(),
                bodyService.getBodyById(car.getBody_id()).getTypeBody());
        return info;
    }

}
