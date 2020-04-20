package home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import home.practice.service.GreetingService;

public class ConstructorInjectedController {
	GreetingService greetingService;

	@Autowired // Optional
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}
}
