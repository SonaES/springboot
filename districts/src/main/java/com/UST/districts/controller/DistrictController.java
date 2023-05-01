package com.UST.districts.controller;

import com.UST.districts.entity.districtState;
import com.UST.districts.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @GetMapping("/add")
    public List <districtState> getAllDistricts(){
        return districtService.getDistricts();
    }

    @GetMapping("/{state}")
    public districtState getDistrictByState(@PathVariable String state){
        return districtService.getDistrictByState(state);
    }
}


