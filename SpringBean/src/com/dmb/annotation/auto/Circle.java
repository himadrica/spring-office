package com.dmb.annotation.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


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
	
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

}
