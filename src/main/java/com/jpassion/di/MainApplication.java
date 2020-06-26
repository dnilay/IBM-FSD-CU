package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfiguration.class)
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		Person person = context.getBean(Person.class);
		System.out.println(getPersonInfo(person));
	}

	public static String getPersonInfo(Person person) {
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() 
				+ " " + person.getAddress().getCity()
				+ " " + person.getAddress().getCountry();
	}
	
}
