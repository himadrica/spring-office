package com.dmb.stereo.annotation.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/* @Component annotation tag telling spring framework that its a bean. You can specialized the bean by setting 
 * annotation as bean by setting different bean type for example
 * @Service "Model/service layer"
 * @Repository "Data object"
 * @Controller "CEO of MVC"
 * 
 * It will define 
 * - Level of documentation
 * - AOP
 * - Extra information to spring informework that it is bean but works different way
 */


@Component
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
