package home.practice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
public class frenchGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Bonjour !";
	}

}
