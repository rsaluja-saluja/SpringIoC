package com.springIoC;


public class IOTDeviceBeanLifeCycleMethods {

	private String device = "Air Conditioner";
	private String desc = "AC Temp Sensor";
	
	public IOTDeviceBeanLifeCycleMethods() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("IOTDeviceBeanLifeCycleMethods Object created successfully");
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "IOTDevice [device=" + device + ", desc=" + desc + "]";
	}
	
	// Ctor is called before init bean method
	public void initBean() {
		// TODO Auto-generated method stub
		System.out.println("initBean called");
	}
	public void destroyBean() {
		// TODO Auto-generated method stub
		System.out.println("destroyBean called");
	}
}
