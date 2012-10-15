package com.dmb.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements InitializingBean, DisposableBean{
	private int radius;
	private Point center;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public Circle()
	{
		System.out.println("Fro circle constructor ");
	}
	
	public void draw()
	{
		System.out.println("Radius = "+getRadius()+", Center = "+getCenter());
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy bean");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Iniilizing bean");
	}
	
	public void myinit()
	{
		System.out.println("Manual MyInit is calling..");
	}
	
	public void mydestroy()
	{
		System.out.println("Manual Destroy is calling ..");
	}
}
