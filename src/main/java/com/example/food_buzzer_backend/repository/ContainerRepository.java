
package com.example.food_buzzer_backend.repository; 
import com.example.food_buzzer_backend.model.Container; 
import org.springframework.data.jpa.repository.JpaRepository; 

public interface ContainerRepository extends JpaRepository<Container, Long> {

 }
