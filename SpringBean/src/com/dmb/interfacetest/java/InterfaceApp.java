package com.dmb.interfacetest.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class InterfaceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("resource/interfacebean.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
