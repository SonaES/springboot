package com.UST.districts.repository;

import com.UST.districts.entity.districtState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<districtState,String> {
    districtState findByState(String state);
}
