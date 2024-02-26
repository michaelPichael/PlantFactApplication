package org.trueplant.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.trueplant.domain.Plant;

@Service
public class PlantService {

    public Plant getPlant(Integer id){
        return Plant.builder()
                .id(id)
                .name("Snowbell")
                .description("A Snowbell is pretty")
                .origin("North America")
                .hardinessZone("10a")
                .soilType("loamy")
                .build();
    }
}
