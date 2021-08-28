package com.springIoC.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContextAuto.xml");
//		Car car = (Car) appCtx.getBean("carBean");
//		System.out.println("Car: "+car);
//		
//		Car carCtor = (Car) appCtx.getBean("carBeanCtor");
//		System.out.println("Car Ctor: "+carCtor);
//		
//		Car carCtor1 = (Car) appCtx.getBean("carBeanCtor1");
//		System.out.println("Car Ctor1: "+carCtor1);
//		
//		Car carBeanAutoWire = (Car) appCtx.getBean("carBeanAutoWire");
//		System.out.println("Car Ctor AutoWire: "+ carBeanAutoWire);
//		
		Car carBeanAutoWireAnnot = (Car) appCtx.getBean("carBeanAutoWireAnnot");
		System.out.println("Car Ctor AutoWire: "+ carBeanAutoWireAnnot);
	}

}
