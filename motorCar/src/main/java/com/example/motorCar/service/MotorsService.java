package com.example.motorCar.service;

import com.example.motorCar.entity.Motors;
import com.example.motorCar.repository.MotorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MotorsService {
    @Autowired
    private MotorsRepository motorsRepository;
    public List<Motors> getAllCars() {
        return motorsRepository.findAll();
    }

    public List<Motors> getAllDate() {
        return motorsRepository.findAll();
    }
}
