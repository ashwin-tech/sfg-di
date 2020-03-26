package home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import home.practice.service.GreetingService;

@Controller
public class i18nController {
	@Qualifier("i18n")
	@Autowired
	GreetingService greetingService;

	public i18nController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}

}
