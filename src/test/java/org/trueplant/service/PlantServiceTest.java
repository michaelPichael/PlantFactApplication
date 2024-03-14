package org.trueplant.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.trueplant.repository.Plant;
import org.trueplant.repository.PlantRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class PlantServiceTest {

    PlantRepository plantRepository = Mockito.mock(PlantRepository.class);
    PlantService plantService = new PlantService(plantRepository);
    @Test
    public void getPlantTest(){
        // Given
        Integer testId = 69;
        Optional<Plant> expectedOptional = Optional.of(Mockito.mock(Plant.class));
        Mockito.when(plantService.getPlant(testId)).thenReturn(expectedOptional);
        // When
        Optional<Plant> res = plantService.getPlant(testId);
        // Then
        verify(plantRepository, times(1)).findById(testId);
        // And
        assertEquals(expectedOptional, res);
    }
}