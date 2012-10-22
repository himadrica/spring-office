package com.dmb.stereo.annotation.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationStereo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("resource/annotationStereoBean.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
