package com.dmb.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("resource/beans.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		System.out.println(triangle);

	}

}
