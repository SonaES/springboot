package com.example.EcommerceCars.service;

import com.example.EcommerceCars.entity.Cars;
import com.example.EcommerceCars.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;


    public Cars addDetails(Cars cars) {
        return carRepo.save(cars);
    }

    public Cars getAllCarDetails(int id) {
        List desiredColor = Arrays.asList("Pearl White");
        List desiredPayment = Arrays.asList("Online/Debit Card");
        List desiredCity = Arrays.asList("EKM");


        Cars cars = carRepo.findById(id).orElse(null);


        if (cars != null) {
            cars.setColors(desiredColor);
            cars.setPayment(desiredPayment);
            cars.setCities(desiredCity);
        }


        return cars;


    }

}

