package home.practice.service;

public class GermanGreetingService implements GreetingService {
	GreetingRepository greetingRepository;

	public GermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return greetingRepository.getGermanGreeting();
	}

}
