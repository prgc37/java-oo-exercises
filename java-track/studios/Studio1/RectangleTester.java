package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTester {

	@Test
	public void testGetLength() {
		Rectangle ch = new Rectangle(10, 20);
		assertTrue(ch.getLength() == 10);
	}
	
	@Test
	public void testGetWidth() {
		Rectangle ch = new Rectangle(10, 20);
		assertTrue(ch.getWidth() == 20);
	}
	
	@Test
	public void testGetPerimeter() {
		Rectangle ch = new Rectangle(10, 20);
		assertTrue(ch.getPerimeter() == 60);
	}
	
	@Test
	public void testGetArea() {
		Rectangle ch = new Rectangle(10, 20);
		assertTrue(ch.getArea() == 200);
	}
	
	@Test
	public void testIsSmaller() {
		Rectangle ch = new Rectangle(10, 20);
		Rectangle x = new Rectangle(5, 10);
		assertTrue(x.isSmaller(ch) == true);
	}
	
	@Test
	public void testIsSquare() {
		Rectangle ch = new Rectangle(10, 20);
		assertTrue(ch.isSquare() == false);
	}

}
