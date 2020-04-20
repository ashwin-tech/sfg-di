package home.practice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import home.practice.service.GreetingRepository;
import home.practice.service.GreetingService;
import home.practice.service.GreetingServiceFactory;

@Configuration
public class GreetingsConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}

	@Bean
	@Primary
	@Profile({ "en", "default" })
	GreetingService EnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Profile("es")
	GreetingService SpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Profile("de")
	GreetingService GermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
}
