package org.eclipse.wb.swing;

public class Circle implements Measurable{

	private float radius;
	
	public Circle(float r){
		this.radius = r;
	}
	
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float)Math.PI * this.radius * this.radius;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (float)Math.PI * this.radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
