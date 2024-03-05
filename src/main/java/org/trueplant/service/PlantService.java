package org.trueplant.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.trueplant.repository.Plant;
import org.trueplant.repository.PlantRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;
    public Optional<Plant> getPlant(Integer id){
        return plantRepository.findById(id);
    }
}
