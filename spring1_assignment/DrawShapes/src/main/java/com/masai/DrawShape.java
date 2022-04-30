package com.masai;

public class DrawShape {
	
	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		shape.draw();
	}
	

}
