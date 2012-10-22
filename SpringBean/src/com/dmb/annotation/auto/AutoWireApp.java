package com.dmb.annotation.auto;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutoWireApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("resource/annotationAutoWiredBean.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
