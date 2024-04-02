package org.trueplant.it;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HealthIT {

    TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    public void checkHealthTest() throws URISyntaxException {
        // Given
        String expectedResponse = "We're up!";
        URI uri = new URI("http://localhost:8080/health");
        // When
        ResponseEntity<String> res = testRestTemplate.getForEntity(uri, String.class);
        // Then
        assertEquals(200, res.getStatusCodeValue());
        assertEquals(expectedResponse, res.getBody());
    }
}
