package home.practice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Qualifier("i18n")
@Service
public class i18nSpanishGreetingService implements GreetingService{

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Ola";
	}

}
