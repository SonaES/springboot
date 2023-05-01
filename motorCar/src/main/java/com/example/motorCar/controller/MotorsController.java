package com.example.motorCar.controller;

import com.example.motorCar.entity.Motors;
import com.example.motorCar.service.MotorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sharathcars/")
public class MotorsController {
    @Autowired
    private MotorsService motorsService;

    @GetMapping("/cars")
    public List<Motors> getAllCars(){
        return motorsService.getAllCars();
    }
    @GetMapping("/cars/date")
    public  List<Motors>getAllDate(){
        return motorsService.getAllDate();
    }
}
