package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"BN","default"})
@Service("I18nService")
public class I18nGreetingServiceBengali implements GreetingService {

	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Bengali Language";
	}

}
