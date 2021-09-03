package com.springIoC.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBeanConfig {

	@Bean(name = "carBean")
	public Car carBean() {
		Car car = new Car();
		car.setType("Hatchback");
		car.setModel("AB 2021");
		car.setPrice(50000);
		car.setNotes(Arrays.asList("Better Engine","5 year extra service"));
		return car;
	}
	
	@Bean(name = "engineBMW")
	public Engine enginBean() {
		return new Engine(370,4000,2.0f,"I-8","BMW premium");
	}
	
	@Bean(name = "seatOptionOne")
	public Seats getSeatBean1() {
		return new Seats("Leather", "Black");
	}
	@Bean(name = "seatOptionTwo")
	public Seats getSeatBean2() {
		return new Seats("Leather", "Grey");
	}
	@Bean(name = "seatOptionThree")
	public Seats getSeatBean3() {
		return new Seats("Leather", "Blue");
	}
	
}
