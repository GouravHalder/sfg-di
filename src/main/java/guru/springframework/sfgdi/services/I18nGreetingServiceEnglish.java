package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nGreetingServiceEnglish implements GreetingService {

	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - ENG Language";
	}

}
