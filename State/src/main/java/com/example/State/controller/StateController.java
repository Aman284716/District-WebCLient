package com.example.State.controller;

import com.example.State.dto.Response;
import com.example.State.model.State;
import com.example.State.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    private StateService stateService;

    // Endpoint to add multiple states
    @PostMapping("/addAll")
    public List<State> addAllStates(@RequestBody List<State> states) {
        return stateService.addallState(states);
    }

    // Endpoint to get a state by state code
    @GetMapping("/{stateCode}")
    public State getStateByStateCode(@PathVariable String stateCode) {
        return stateService.getStatebyStateid(stateCode);
    }

    // Endpoint to get state districts by state code
    @GetMapping("/{stateCode}/districts")
    public Response getStateDistricts(@PathVariable String stateCode) {
        return stateService.getStateDistrict(stateCode);
    }
}
