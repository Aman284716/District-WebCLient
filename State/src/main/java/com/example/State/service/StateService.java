package com.example.State.service;

import com.example.State.dto.District;
import com.example.State.dto.Response;
import com.example.State.model.State; // Import the correct State class
import com.example.State.repo.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StateService {

    @Autowired
    StateRepo sr;

    @Autowired
    WebClient wbclient;

    public List<State> addallState(List<State> states) {
        return sr.saveAll(states);
    }

    public State getStatebyStateid(String statecode) {
        return sr.findByStatecode(statecode).orElse(null);
    }

    public Response getStateDistrict(String statecode){
        Response result = new Response();
        State statedata = sr.findByStatecode(statecode).orElse(null);;
        List<District> alldist = wbclient.get()
                .uri("http://localhost:8081/District/getDistrict/" + statedata.getStatecode())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<District>>() {}).block();
        result.setDistricts(alldist);
        result.setName(statedata.getName());
        result.setStatecode(statedata.getStatecode());
        return result;
    }
}
