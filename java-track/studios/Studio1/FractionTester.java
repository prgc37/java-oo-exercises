package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTester {

	@Test
	public void testGetNum() {
		Fraction f = new Fraction(2, 8);
		assertTrue(f.getNum() == 2);
	}
	
	@Test
	public void testGetDen() {
		Fraction f = new Fraction(2, 8);
		assertTrue(f.getDen() == 8);
	}
	
	@Test
	public void testFracAdd() {
		Fraction f = new Fraction(2, 8);
		Fraction g = new Fraction(1, 2);
		assertTrue(f.getNum() == 2);
		int mult1 = f.denominator;
		assertTrue(mult1 == 8);
		f.denominator = f.denominator * g.denominator;
		assertTrue(f.getDen() == 16);
		f.numerator = (g.denominator * f.numerator) + (mult1 * g.numerator);
		assertTrue(f.getNum() == 12);
		assertTrue(f.getDen() == 16);
	}
	
	@Test
	public void testMultiFrac() {
		Fraction f = new Fraction(2, 8);
		Fraction g = new Fraction(2, 4);
		f.numerator = f.numerator * g.numerator;
		assertTrue(f.getNum() == 4);
		f.denominator = f.denominator * g.denominator;
		assertTrue(f.getDen() == 32);
	}
	
	@Test
	public void testReciprocal() {
		Fraction f = new Fraction(2, 8);
		int nph = f.numerator;
		assertTrue(nph == 2);
		int dph = f.denominator;
		assertTrue(dph == 8);
		f.denominator = nph;
		assertTrue(f.getDen() == 2);
		f.numerator = dph;
		assertTrue(f.getNum() == 8);
	}
	
//	@Test
//	public void testLCM(int a, int b) {
//		Fraction f = new Fraction(2, 8);
//		if (b == 0)
//			return a;
//		return lcm(b, a % b);
//	}
//	
//	@Test
//	public void testSimple() {
//		Fraction f = new Fraction(2, 8);
//
//		int factor = lcm(f.numerator, f.denominator);
//		
//	}

}
