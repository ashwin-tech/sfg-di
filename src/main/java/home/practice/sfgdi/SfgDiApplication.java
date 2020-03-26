package home.practice.sfgdi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import home.practice.controller.*;

//scanBasePackages is used to scan @Controller in a different package
@SpringBootApplication(scanBasePackages = { "home.practice.controller","home.practice.service" })
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		// spring automatically instantiates the class
		// no need to use new key word
		// bean name is similer to class name but starts with a lower case
		// Print all the bean names
		/*
		 * String[] s = ctx.getBeanDefinitionNames(); for(String name : s){
		 * System.out.println("Bean Name :"+name); }
		 */
		i18nController mycontroller = (i18nController) ctx.getBean("i18nController");
		mycontroller.getGreetings();

		PropertyInjectedController pic = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		pic.getGreetings();
	}

}
