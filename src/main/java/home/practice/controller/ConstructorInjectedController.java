package home.practice.controller;

import home.practice.service.GreetingService;

public class ConstructorInjectedController {
	GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}
}
