package com.example.motorCar.repository;

import com.example.motorCar.entity.Motors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorsRepository extends JpaRepository<Motors,Integer> {
}
