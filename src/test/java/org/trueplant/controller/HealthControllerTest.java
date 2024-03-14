package org.trueplant.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthControllerTest {

    HealthController healthController = new HealthController();
    @Test
    public void checkHealthTest(){
        // Given
        String expectedMessage = "We're up!";
        // When
        String res = healthController.checkHealth();
        // Then
        assertEquals(expectedMessage, res);
    }
}