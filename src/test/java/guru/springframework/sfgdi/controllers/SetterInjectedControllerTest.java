package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGs(new ContructorGreetingService());
    }

    @Test
    void getGreeting() {
    	
        System.out.println(controller.getGreeting());
    }
}