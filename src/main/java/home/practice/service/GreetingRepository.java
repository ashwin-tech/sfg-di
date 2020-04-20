package home.practice.service;

import org.springframework.stereotype.Service;

@Service
public interface GreetingRepository {
	public String getEnglishGreeting();

	public String getSpanishGreeting();

	public String getGermanGreeting();
}
