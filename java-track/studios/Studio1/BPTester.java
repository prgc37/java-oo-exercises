package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BPTester {

	@Test
	public void testGetName() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getName() == "Wayne");
	}
	
	@Test
	public void testGetNumber() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getNumber() == 99);
	}
	
	@Test
	public void testGetHand() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getHand() == "right");
	}
	
	@Test
	public void testGetHits() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getHits() == 0);
	}
	
	@Test
	public void testGetHRs() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getHRs() == 0);
	}
	
	@Test
	public void testGetRBIs() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getRBIs() == 0);
	}
	
	@Test
	public void testGetGP() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getGP() == 0);
	}
	
	@Test
	public void testPlayGame() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getGP() == 0);
		bp.playGame();
		assertTrue(bp.getGP() == 1);
	}
	
	@Test
	public void testHitHR() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getHRs() == 0);
		bp.hitHR();
		assertTrue(bp.getHRs() == 1);
	}
	
	@Test
	public void testEarnRBI() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getRBIs() == 0);
		bp.earnRBI();
		assertTrue(bp.getRBIs() == 1);
	}
	
	@Test
	public void testHit() {	
		BaseballPlayer bp = new BaseballPlayer("Wayne", 99, "right");
		assertTrue(bp.getHits() == 0);
		bp.hit();
		assertTrue(bp.getHits() == 1);
	}
}
