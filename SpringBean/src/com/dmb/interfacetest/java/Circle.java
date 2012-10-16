package com.dmb.interfacetest.java;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private Point center;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is being drawn, Center is "+getCenter());	
	}
	public Point getCenter() {
		return center;
	}
	
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

}
