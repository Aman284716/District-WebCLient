package com.example.District.service;

import com.example.District.model.District;
import com.example.District.repo.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictRepo dr;

    public District adddistrict(District d) {
       return  dr.save(d);
    }

    public List<District> saveDistrict(List<District> allDistricts) {
        return dr.saveAll(allDistricts);
    }

    public District getDistrictById(Long id) {
        return dr.findById(id).orElse(null);
    }

    public List<District> getAllDistricts() {
        return dr.findAll();
    }

    public List<District> getDistrictByStateid(String stateid){
        return dr.findByStateId(stateid); // Replace 1 with actual state id
    }
}
