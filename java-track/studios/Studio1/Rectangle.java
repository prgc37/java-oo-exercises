package Studio1;

public class Rectangle {
	private static final boolean True = false;
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width; 
	}
	
	public int getPerimeter() {
		int perimeter = (this.length + this.width) * 2;
		return perimeter; 
	}
	
	public int getArea(int length, int width) {
		int area = this.length * this.width;
		return area;	
	}
	
	public boolean isSmaller(Rectangle x) {
		if (this.getArea(this.length, this.width) < (x.length * x.width)) 
			return true;
		return false;
	}
	
	public boolean isSquare() {
		if (this.length == this.width){
			return true;
		}
		else {
			return false; 
		}
	}
	
	public String toString(){
		return "With a width of: " + this.width + ", and a length of: " + this. length + ", our Rectangle has an area of: " + getArea(this.length, this.width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(10, 12);
		System.out.println(rec1);
	}

}
