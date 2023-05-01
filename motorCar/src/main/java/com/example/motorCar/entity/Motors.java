package com.example.motorCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motors {
    @Id
    private int carId;
    private String carName;
    private  double price;
    private  String brand;
    private  String color;
    private  int NoOfSeats;
    private String avaiabilityDate;
    private  boolean status;


}
