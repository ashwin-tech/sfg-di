package home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import home.practice.service.GreetingService;
@Controller
public class PropertyInjectedController {
	//@Primary will take presidence over @Qualifier
	//@Qualifier("frenchGreetingServiceImpl")
	@Autowired
	GreetingService greetingService;

	public void getGreetings() {
		System.out.println("Output : " + greetingService.sayGreetings());
	}
}
