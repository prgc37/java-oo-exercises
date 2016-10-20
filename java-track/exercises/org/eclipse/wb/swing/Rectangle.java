package org.eclipse.wb.swing;

public class Rectangle implements Measurable{

	private float height;
	private float width;
	
	public Rectangle(float h, float w){
		this.height = h;
		this.width = w;
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return (2 * this.height) + (2 * this.width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
}
