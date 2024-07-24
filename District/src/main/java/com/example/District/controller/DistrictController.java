package com.example.District.controller;

import com.example.District.model.District;
import com.example.District.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/District")
public class DistrictController {
    @Autowired
    DistrictService ds;

    @PostMapping("/saveDistrict")
    public District saveDistrict(@RequestBody District d) {
        return ds.adddistrict(d);
    }

    @PostMapping("/saveallDistrict")
    public List<District> allsaveDistrict(@RequestBody List<District> d) {
        return ds.saveDistrict(d);
    }

    @GetMapping("/getDistrict/{stateid}")
    public List<District> getDistrict(@PathVariable String stateid) {
        return ds.getDistrictByStateid(stateid);
    }

    @GetMapping("/getallDistrict")
    public List<District> getAllDistricts() {
        return ds.getAllDistricts();
    }
}
