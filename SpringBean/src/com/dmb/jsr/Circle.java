package com.dmb.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Circle is being drawn, Center is "+getCenter());	
	}
	
	public Point getCenter() {
		return center;
	}
	
	/*
	 * you can use @Resource annotation and supply the bean through name parameter
	 * @Resource(name="") eg name = beanName, if you not supply the bean name, it will search for the bean.xml file for bean by parameter name "center"
	 */
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Circle is initialized");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Circle is destroyed");
	}

}
