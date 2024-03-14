package org.trueplant.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.trueplant.repository.Plant;
import org.trueplant.service.PlantService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class PlantControllerTest {

    PlantService plantService = Mockito.mock(PlantService.class);
    PlantController plantController = new PlantController(plantService);
    @Test
    public void getPlantTest(){
        // Given
        Integer testId = 1;
        Plant expectedPlant = Mockito.mock(Plant.class);
        Mockito.when(plantService.getPlant(testId)).thenReturn(Optional.of(expectedPlant));
        // When
        Plant res = plantController.getPlant(testId);
        // Then
        verify(plantService, times(1)).getPlant(testId);
        // And
        assertEquals(expectedPlant, res);
    }

    @Test
    public void notFoundPlantTest(){
        // Given
        Integer testId = 69;
        Mockito.when(plantService.getPlant(testId)).thenReturn(Optional.empty());
        // When
        Plant res = plantController.getPlant(testId);
        // Then
        verify(plantService, times(1)).getPlant(testId);
        // And
        assertNull(res);
    }
}