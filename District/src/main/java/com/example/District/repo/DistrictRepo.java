package com.example.District.repo;

import com.example.District.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepo extends JpaRepository<District,Long> {
   List<District> findByStateId(String stateid);
}
