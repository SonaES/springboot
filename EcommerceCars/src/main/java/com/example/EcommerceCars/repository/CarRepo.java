package com.example.EcommerceCars.repository;

import com.example.EcommerceCars.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Cars,Integer> {
}
