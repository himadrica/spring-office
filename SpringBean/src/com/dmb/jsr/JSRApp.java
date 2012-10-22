package com.dmb.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JSRApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("resource/jsrbean.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
