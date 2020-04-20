package home.practice.service;

public class SpanishGreetingService implements GreetingService {
	GreetingRepository greetingRepository;

	public SpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return greetingRepository.getSpanishGreeting();
	}

}