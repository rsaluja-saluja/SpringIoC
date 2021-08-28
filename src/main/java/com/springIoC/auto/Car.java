package com.springIoC.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	String type;
	String model;
	double price;
	
	@Autowired
	Engine engine;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String type, String model, double price, Engine engine) {
		super();
		this.type = type;
		this.model = model;
		this.price = price;
		this.engine = engine;
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
	@Override
	public String toString() {
		return "Car [type=" + type + ", model=" + model + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
}
