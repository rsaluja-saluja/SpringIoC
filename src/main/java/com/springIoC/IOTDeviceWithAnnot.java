package com.springIoC;

import org.springframework.stereotype.Component;

//@Component
public class IOTDeviceWithAnnot {

	private String device = "Air Conditioner";
	private String desc = "Temp Sensor";
	
	
	public IOTDeviceWithAnnot() {
		super();
		// TODO Auto-generated constructor stub
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
