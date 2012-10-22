package com.dmb.stereo.annotation.java;

public class Triangle implements Shape {
	private Point A;
	private Point B;
	private Point C;
	
	
	public Point getA() {
		return A;
	}


	public void setA(Point a) {
		A = a;
	}


	public Point getB() {
		return B;
	}


	public void setB(Point b) {
		B = b;
	}


	public Point getC() {
		return C;
	}


	public void setC(Point c) {
		C = c;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing triangle");
		System.out.println("A = "+getA() + ", B = "+ getB() +", C = "+ getC());
	}

}
