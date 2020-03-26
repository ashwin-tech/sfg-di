package home.practice.controller;

import home.practice.service.GreetingService;

public class SetterInjectedController {
	GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}
}
