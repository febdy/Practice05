package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}

}
