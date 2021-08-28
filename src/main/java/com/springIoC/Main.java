package com.springIoC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		IOTDevice iotDevice = new IOTDevice();
		System.out.println("IOTDevice initialized from Ctor: "+iotDevice);
		
		System.out.println("**** Bean Factory container: ****");
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		IOTDevice myDeviceBean = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
		System.out.println("XMLBeanFactory: "+myDeviceBean); //XMLBeanFactory: IOTDevice [device=Air Conditioner, desc=Temp Sensor]
		
		myDeviceBean.setDesc("Updated Desc");
		System.out.println("Updated: "+myDeviceBean); //Updated: IOTDevice [device=Air Conditioner, desc=Updated Desc]

		
		IOTDevice myDeviceBean1 = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
		System.out.println("XMLBeanFactory: "+myDeviceBean1); //XMLBeanFactory: IOTDevice [device=Air Conditioner, desc=Updated Desc]

		// BeanDefinitionRegistry - regiter and retrieve beans
		
		System.out.println("**** BeanDefinitionRegistry ****");
		Resource resource1 = new ClassPathResource("applicationContext.xml");
		
		BeanDefinitionRegistry beanFactory1 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory1);
		beanReader.loadBeanDefinitions(resource1);
		
		//getBean would create bean
		IOTDevice device1 = (IOTDevice) ((DefaultListableBeanFactory)beanFactory1).getBean("myIOTDeviceBean");
		System.out.println("BeanRegistry IOTDevice "+device1);
		
		System.out.println("**** ApplicationContext ****");
		//Below loading of context would creates beans defined
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IOTDevice device2 = (IOTDevice) appContext.getBean("myIOTDeviceBean");
		IOTDevice device3 =  appContext.getBean("myIOTDeviceBean",IOTDevice.class);
		IOTDevice device4 =  appContext.getBean("myIOTDeviceBeanOne",IOTDevice.class);
		device3.setDesc("Updated Desc");
		System.out.println("Context IOTDevice: "+device2);//IOTDevice [device=Air Conditioner, desc=Updated Desc]
		System.out.println("Context IOTDevice: "+device3);//IOTDevice [device=Air Conditioner, desc=Updated Desc]
		System.out.println("Context IOTDevice: "+device4);//IOTDevice [device=Air Conditioner, desc=Temp Sensor]

		// context is extension of BeanFactory
//		BeanFactory factory1 = (BeanFactory)appContext;
//		IOTDevice device3 = (IOTDevice) factory1.getBean("myIOTDeviceBean");
//		System.out.println("Context BeanFactory IOTDevice: "+device3);
		
		System.out.println("**** ApplicationContext With Annotation ****");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);
		IOTDeviceWithAnnot deviceAnnot = ctx.getBean(IOTDeviceWithAnnot.class);
		deviceAnnot.setDesc("AC Update Desc");
		System.out.println("context with annotation devic: "+deviceAnnot);
		
//		IOTDevice dev = ctx.getBean(IOTDevice.class); // NoSuchBeanDefinitionException
//		System.out.println(dev);
		
		System.out.println("**** ApplicationContext With Bean Annotation ****");

		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);
		IOTDeviceWithAnnot deviceAnnot1 = ctx1.getBean(IOTDeviceWithAnnot.class);
		deviceAnnot1.setDesc("AC Update Desc Bean");
		System.out.println("context with Bean annotation device: "+deviceAnnot1);
		
		//Bean defaut name is name of method
		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);
		
		IOTDeviceWithAnnot deviceAnnot2 = (IOTDeviceWithAnnot) ctx2.getBean("getIOTDeviceAnnotObject");
		deviceAnnot2.setDesc("AC Update Desc Default Bean Name");
		System.out.println("context with Default Bean Name annotation device: "+deviceAnnot2);

		System.out.println("**** ApplicationContext With Bean LifeCycle in XML file****");
		
		
		ApplicationContext ctx3 = new ClassPathXmlApplicationContext("applicationContext.xml");
		IOTDeviceBeanLifeCycleMethods deviceBean = ctx3.getBean("myIOTDeviceBeanLifeCycle",IOTDeviceBeanLifeCycleMethods.class);
		System.out.println("Device 5 Bean Life Cycle: "+deviceBean);
		((ClassPathXmlApplicationContext)ctx3).close(); //destroy bean would be called only when context is closed
		
		System.out.println("**** ApplicationContext With Bean LifeCycle in bean config file ****");
		
		
		ApplicationContext ctx4 = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class); 
		IOTDeviceBeanLifeCycleMethods deviceBean1 = (IOTDeviceBeanLifeCycleMethods) ctx4.getBean("FridgeBean");
		System.out.println("Device Bean Life Cycle : "+deviceBean1);
		
		IOTDeviceBeanLifeCycleMethods deviceBean2 = (IOTDeviceBeanLifeCycleMethods) ctx4.getBean("DWBean");
		System.out.println("Device Bean Life Cycle : "+deviceBean2);
		
		((AnnotationConfigApplicationContext)ctx4).close(); //destroy bean would be called only when context is closed
		
		System.out.println("**** ApplicationContext With Bean LifeCycle with Annotations and bean in XML file ****");
		
		
		ApplicationContext ctx5 = new ClassPathXmlApplicationContext("applicationContext.xml");
		IOTDeviceBeanLifeCycleMethodsAnnot deviceBean3 = ctx5.getBean("FridgeBean",IOTDeviceBeanLifeCycleMethodsAnnot.class);
		System.out.println("Fridge Bean Life Cycle With annotation : "+deviceBean3);
		
		IOTDeviceBeanLifeCycleMethodsAnnot deviceBean4 = ctx5.getBean("DWBean",IOTDeviceBeanLifeCycleMethodsAnnot.class);
		System.out.println("DW Bean Life Cycle With annotation : "+deviceBean4);
		
		IOTDeviceBeanLifeCycleMethodsAnnot deviceBean5 = ctx5.getBean("OvenBean",IOTDeviceBeanLifeCycleMethodsAnnot.class);
		System.out.println("Oven Bean Life Cycle With annotation : "+deviceBean5);
		
		IOTDeviceBeanLifeCycleMethodsAnnot deviceBean6 = ctx5.getBean("TableBean",IOTDeviceBeanLifeCycleMethodsAnnot.class);
		System.out.println("Table Bean Life Cycle With annotation : "+deviceBean6);
		
		((ClassPathXmlApplicationContext)ctx5).close();
	}
}

