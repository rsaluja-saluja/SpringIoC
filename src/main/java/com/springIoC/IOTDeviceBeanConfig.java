package com.springIoC;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springIoC")
public class IOTDeviceBeanConfig {

	@Bean//(name = "IOTDeviceWithAnnotBean")
	public IOTDeviceWithAnnot getIOTDeviceAnnotObject() {
		return new IOTDeviceWithAnnot();
	}

	@Bean(name = "FridgeBean", initMethod = "initBean", destroyMethod = "destroyBean")
	public IOTDeviceBeanLifeCycleMethods getIOTDeviceBeanLifeCycleFridgeObject() {
		IOTDeviceBeanLifeCycleMethods obj = new IOTDeviceBeanLifeCycleMethods();
		obj.setDevice("Fridge");
		obj.setDesc("Fridge Desc");
		//return new IOTDeviceBeanLifeCycleMethodsAnnot();
		return obj;
	}
	
	@Bean(name = "DWBean", initMethod = "initBean", destroyMethod = "destroyBean")
	public IOTDeviceBeanLifeCycleMethods getIOTDeviceBeanLifeCycleDWObject() {
		IOTDeviceBeanLifeCycleMethods obj = new IOTDeviceBeanLifeCycleMethods();
		obj.setDevice("DishWasher");
		obj.setDesc("DishWasher Desc");
		//return new IOTDeviceBeanLifeCycleMethodsAnnot();
		return obj;
	}
}
