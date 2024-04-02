package org.trueplant.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.trueplant.domain.Plant;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PlantIT {

    TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    public void getPlantTest() throws URISyntaxException {
        // Given
        URI uri = new URI("http://localhost:8080/plant?id=1");
        Plant expectedPlant = new Plant(
                "Snowbell",
                1,
                "A Snowbell is pretty",
                "North America",
                "loamy",
                "10a"
        );
        // When
        ResponseEntity<Plant> res = testRestTemplate.getForEntity(uri, Plant.class);
        // Then
        assertEquals(200, res.getStatusCodeValue());
        assertNotNull(res.getBody());
        assertEquals(expectedPlant, res.getBody());
    }

    @Test
    public void getNoPlantTest() throws URISyntaxException {
        // Given
        URI uri = new URI("http://localhost:8080/plant?id=69");
        // When
        ResponseEntity<Plant> res = testRestTemplate.getForEntity(uri, Plant.class);
        // Then
        assertEquals(200, res.getStatusCodeValue());
        assertNull(res.getBody());
    }
}
