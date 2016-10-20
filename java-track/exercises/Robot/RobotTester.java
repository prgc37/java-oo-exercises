package Robot;

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
	public void testInvalidSpeed(){
		try{
			Robot r = new Robot("Sam", 1, 1, -5, "N");
			fail("Exception was not thrown for invalid speed value");
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
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
	
	@Test
	public void testGetBaseLanguage() {
		Translator t = new Translator("Kit9", 5, 10, 2, "N", "Spanish", 250000000);
		assertTrue(t.getBaseLanguage() == "Spanish");
	}
	
	@Test
	public void testGetVocabularySize() {
		Translator t = new Translator("Kit9", 5, 10, 2, "N", "Spanish", 250000000);
		assertTrue(t.getVocabularySize() == 250000000);
	}
	
	
}
