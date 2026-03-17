package com.example.food_buzzer_backend.service;

import com.example.food_buzzer_backend.dto.container.*;
import com.example.food_buzzer_backend.model.Container;
import com.example.food_buzzer_backend.repository.ContainerRepository;
import org.springframework.stereotype.Service;

@Service
public class ContainerService {

    private final ContainerRepository containerRepository;

    public ContainerService(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    public ContainerResponse addContainer(ContainerAddDTO dto) {

        ContainerResponse response = new ContainerResponse();

        Container container = new Container();
        container.setName(dto.getName());

        containerRepository.save(container);

        response.setContainerId(container.getId());
        response.setName(container.getName());
        response.setMessage("Container Created");

        return response;
    }

    public ContainerResponse updateContainer(ContainerUpdateDTO dto) {

        ContainerResponse response = new ContainerResponse();

        Container container = containerRepository.findById(dto.getId()).orElse(null);

        if (container == null) {
            response.setMessage("Container Not Found");
            return response;
        }

        container.setName(dto.getName());
        containerRepository.save(container);

        response.setContainerId(container.getId());
        response.setName(container.getName());
        response.setMessage("Container Updated");

        return response;
    }

    public ContainerResponse deleteContainer(ContainerDeleteDTO dto) {

        ContainerResponse response = new ContainerResponse();

        Container container = containerRepository.findById(dto.getId()).orElse(null);

        if (container == null) {
            response.setMessage("Container Not Found");
            return response;
        }

        containerRepository.delete(container);

        response.setContainerId(container.getId());
        response.setName(container.getName());
        response.setMessage("Container Deleted");

        return response;
    }
}