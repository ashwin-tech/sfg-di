package home.practice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class englishGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hello !";
	}
}