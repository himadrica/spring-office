package com.dmb.jsr;

import javax.annotation.Resource;

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
	
	@Resource(name="pright")
	public void setCenter(Point center) {
		this.center = center;
	}

}
