package com.example.food_buzzer_backend.controller;

import com.example.food_buzzer_backend.dto.container.*;
import com.example.food_buzzer_backend.service.ContainerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/container")
public class ContainerController {

    private final ContainerService containerService;

    public ContainerController(ContainerService containerService) {
        this.containerService = containerService;
    }

    @PostMapping("/add")
    public ContainerResponse addContainer(@RequestBody ContainerAddDTO dto) {
        return containerService.addContainer(dto);
    }

    @PutMapping("/update")
    public ContainerResponse updateContainer(@RequestBody ContainerUpdateDTO dto) {
        return containerService.updateContainer(dto);
    }

    @DeleteMapping("/delete")
    public ContainerResponse deleteContainer(@RequestBody ContainerDeleteDTO dto) {
        return containerService.deleteContainer(dto);
    }
}