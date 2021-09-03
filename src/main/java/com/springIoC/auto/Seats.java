package com.springIoC.auto;

public class Seats {

	String type;
	String color;
	
	
	public Seats(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	public Seats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Seats [type=" + type + ", color=" + color + "]";
	}
	
	
}
