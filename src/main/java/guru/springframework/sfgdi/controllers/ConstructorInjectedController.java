package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;
@Controller
public class ConstructorInjectedController {

	private final GreetingService gs;
	
	 // Not needed in cast of Contructors
	public ConstructorInjectedController(@Qualifier ("contructorGreetingService")  GreetingService gs) {
		super();
		this.gs = gs;
	}
	public String getGreeting() {
		return gs.sayGreeting();
	}
}
