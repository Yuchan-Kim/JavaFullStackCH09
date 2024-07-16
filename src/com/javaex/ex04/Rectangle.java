package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width+height);
	}

	@Override
	public void resize(double s) {
		this.setHeight(s* this.height);
		this.setWidth(s * this.width);
		
	}
	
	
	
    
    

}