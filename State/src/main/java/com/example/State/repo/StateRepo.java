package com.example.State.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.State.model.State;

import java.util.Optional;


@Repository
public interface StateRepo extends JpaRepository<State,Long> {
    Optional<State> findByStatecode(String statecode);
}
