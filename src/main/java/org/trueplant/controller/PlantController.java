package org.trueplant.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trueplant.repository.Plant;
import org.trueplant.service.PlantService;

@RestController
@AllArgsConstructor
@RequestMapping("/plant")
public class PlantController {

    private final PlantService plantService;
    @GetMapping
    public Plant getPlant(@RequestParam Integer id){
        return plantService.getPlant(id).orElse(null);
    }
}
