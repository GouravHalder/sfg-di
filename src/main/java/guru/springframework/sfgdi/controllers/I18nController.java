package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService gs;

	public I18nController(@Qualifier("I18nService") GreetingService gs) {
		//public I18nController(GreetingService gs) {	
		super();
		this.gs = gs;
	}
	public String sayHello() {
		return gs.sayGreeting();
	}


}
