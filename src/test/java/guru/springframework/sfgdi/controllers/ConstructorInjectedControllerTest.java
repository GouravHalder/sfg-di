package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

   

    @Test
    void getGreeting() {
    	
        System.out.println(controller.getGreeting());
    }
    @BeforeEach
    void setUp() {
    	System.out.println("11111");
        controller = new ConstructorInjectedController(new ContructorGreetingService());
    }
}