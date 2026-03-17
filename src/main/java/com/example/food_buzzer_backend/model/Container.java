package com.example.food_buzzer_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "containers")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Default Constructor
    public Container() {
    }

    // Getter for ID
    public Long getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }
}