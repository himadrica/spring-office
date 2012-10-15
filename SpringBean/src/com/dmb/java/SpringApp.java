package com.dmb.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("resource/beans.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		System.out.println(triangle);
		
		Circle circle = (Circle)context.getBean("circle");
		circle.draw();
	}

}
