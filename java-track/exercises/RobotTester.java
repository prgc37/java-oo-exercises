import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void testGetName() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getName() == "Kit9");
	}
	
	@Test
	public void testGetX() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getX() == 5);
	}
	
	@Test
	public void testGetY() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getY() == 10);
	}
	
	@Test
	public void testGetSpeed() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getSpeed() == 2);
	}
	
	@Test
	public void testGetDirect() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getDirection() == "N");
	}
	
	@Test
	public void testMove() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getX() == 5);
		assertTrue(r.getY() == 10);
		assertTrue(r.getSpeed() == 2);
		assertTrue(r.getDirection() == "N");
		r.move("W", 3, 5);
		assertTrue(r.getX() == 0);
		assertTrue(r.getY() == 10);
		assertTrue(r.getSpeed() == 3);
		assertTrue(r.getDirection() == "W");
	}
	
	@Test
	public void testRotate() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getDirection() == "N");
		r.rotate("left");
		assertTrue(r.getDirection() == "W");
		r.rotate("left");
		assertTrue(r.getDirection() == "S");
		r.rotate("left");
		assertTrue(r.getDirection() == "E");
		r.rotate("left");
		assertTrue(r.getDirection() == "N");
		
		r.rotate("right");
		assertTrue(r.getDirection() == "E");
		r.rotate("right");
		assertTrue(r.getDirection() == "S");
		r.rotate("right");
		assertTrue(r.getDirection() == "W");
		r.rotate("right");
		assertTrue(r.getDirection() == "N");
	}
	
	@Test
	public void testGetDistanceTo() {
		Robot r = new Robot("Kit9", 5, 10, 2, "N");
		assertTrue(r.getX() == 5);
		assertTrue(r.getY() == 10);
		r.getDistanceTo(20, -11);
		assertTrue(r.toX == 15);
		assertTrue(r.toY == 21);
	}
	
	//Test different Robot subclasses below
	
	//Carrier
	
	@Test
	public void testGetArms() {
		Carrier c = new Carrier("Kit9", 5, 10, 2, "N", 4, 1500);
		assertTrue(c.getArms() == 4);
	}
	
	@Test
	public void testGetArmCapacity() {
		Carrier c = new Carrier("Kit9", 5, 10, 2, "N", 4, 1500);
		assertTrue(c.getArmCapacity() == 1500);
	}

	//Translator
	
}
