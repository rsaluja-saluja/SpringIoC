package com.springIoC;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IOTDeviceBeanLifeCycleMethodsAnnot {

	private String device = "Air Conditioner";
	private String desc = "AC Temp Sensor";
	
	public IOTDeviceBeanLifeCycleMethodsAnnot() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("IOTDeviceBeanLifeCycleMethodsAnnot Object created successfully");
	}
	
	
	public IOTDeviceBeanLifeCycleMethodsAnnot(String device, String desc) {
		super();
		this.device = device;
		this.desc = desc;
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
	@PostConstruct
	public void initBean() {
		// TODO Auto-generated method stub
		System.out.println("initBean called with annotation");
	}
	
	@PreDestroy
	public void destroyBean() {
		// TODO Auto-generated method stub
		System.out.println("destroyBean called with annotation");
	}
}
