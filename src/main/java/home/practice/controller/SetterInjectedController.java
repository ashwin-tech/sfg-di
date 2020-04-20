package home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import home.practice.service.GreetingService;

@Controller
public class SetterInjectedController {
	GreetingService greetingService;

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}
}
