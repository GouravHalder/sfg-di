package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService gs;
	
	@Autowired
	public MyController(GreetingService gs) {
		super();
		this.gs = gs;
	}
	public String getGreeting() {
		return gs.sayGreeting();
	}

	public String sayHello()
	{
		System.out.println("Hello World");
		return "Hi chaps";
	}
	
}
