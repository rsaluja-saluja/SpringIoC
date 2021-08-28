package com.springIoC;

public class IOTDevice {

	private String device = "Air Conditioner";
	private String desc = "Temp Sensor";
	
	public IOTDevice() {
		super();
		// TODO Auto-generated constructor stub
		//System.out.println("Object created successfully");
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
	
	
}
