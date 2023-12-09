package com.example.m_tech.controllers;

import com.example.m_tech.model.Body;
import com.example.m_tech.model.Car;
import com.example.m_tech.model.Wheel;
import com.example.m_tech.service.BodyService;
import com.example.m_tech.service.CarService;
import com.example.m_tech.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
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
    public ResponseEntity<?> addCar(@RequestBody Car car)  {
        Car c = carService.save(car);
        if(c == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Count < 2");
        }
        return ResponseEntity.ok(c);
    }
    @GetMapping("/getAllCarInformation/{id}")
    public ResponseEntity<?> getCarById(@ModelAttribute("id") Long id) {
        Car car = carService.getCar(id);
        if(car == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No car with this id");
        }
         return  ResponseEntity.ok(car) ;
    }

}
