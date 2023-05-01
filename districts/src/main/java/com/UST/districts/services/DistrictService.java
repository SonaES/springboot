package com.UST.districts.services;

import com.UST.districts.entity.districtState;
import com.UST.districts.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DistrictService {
    @Autowired
    private DistrictRepo districtRepo;
    

    public List<districtState> getDistricts() {
        return districtRepo.findAll();
    }

    public districtState getDistrictByState(String state) {
        return districtRepo.findByState(state);

    }
}
