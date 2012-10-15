package com.dmb.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	private Point top;
	private Point left;
	private Point right;
	
	public Point getTop() {
		return top;
	}
	public void setTop(Point top) {
		this.top = top;
	}
	public Point getLeft() {
		return left;
	}
	public void setLeft(Point left) {
		this.left = left;
	}
	public Point getRight() {
		return right;
	}
	public void setRight(Point right) {
		this.right = right;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [top=" + top + ", left=" + left + ", right=" + right
				+ "]";
	}
	@Override
	public void setBeanName(String beanname) {
		System.out.println("Processing bean name is: = "+beanname);
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("I am not here");
		
	}
	
}
