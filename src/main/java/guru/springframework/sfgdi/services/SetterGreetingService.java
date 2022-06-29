package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - SetterGreetingService";
	}

}
