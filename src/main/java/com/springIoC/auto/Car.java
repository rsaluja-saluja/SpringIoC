package com.springIoC.auto;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	String type;
	String model;
	double price;
	
	@Autowired(required = false)
	@Qualifier("engineBMW")
	Engine engine;
	
	List<String> notes;
	
	@Autowired
	Set<Seats> availableSeatOptions;
	
	
	public Car() {
		super();
		System.out.println("Default Car ctor");

		// TODO Auto-generated constructor stub
	}

	
	
	public Car(String type, String model, double price, Engine engine, List<String> notes,
			Set<Seats> availableSeatOptions) {
		super();
		this.type = type;
		this.model = model;
		this.price = price;
		this.engine = engine;
		this.notes = notes;
		this.availableSeatOptions = availableSeatOptions;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public List<String> getNotes() {
		return notes;
	}



	public void setNotes(List<String> notes) {
		this.notes = notes;
	}



	public Set<Seats> getAvailableSeatOptions() {
		return availableSeatOptions;
	}



	public void setAvailableSeatOptions(Set<Seats> availableSeatOptions) {
		this.availableSeatOptions = availableSeatOptions;
	}



	@Override
	public String toString() {
		return "Car [type=" + type + ", model=" + model + ", price=" + price + ", engine=" + engine + ", notes=" + notes
				+ ", availableSeatOptions=" + availableSeatOptions + "]";
	}
	
	
}
