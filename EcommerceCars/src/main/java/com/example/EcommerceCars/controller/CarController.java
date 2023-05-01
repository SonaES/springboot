package com.example.EcommerceCars.controller;

import com.example.EcommerceCars.entity.Cars;
import com.example.EcommerceCars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardetails")
public class CarController {
    @Autowired
    private CarService carService;
@PostMapping("/car")
    public Cars addDetails(@RequestBody Cars cars){
    return carService.addDetails(cars);
}
@GetMapping("/cars/{id}")
    public Cars getAllCarDetails(@PathVariable int id){
    return carService.getAllCarDetails(id);
}
}
