package home.practice.service;

public class EnglishGreetingService implements GreetingService {
	GreetingRepository greetingRepository;

	public EnglishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return greetingRepository.getEnglishGreeting();
	}

}
