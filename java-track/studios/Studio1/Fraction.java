package Studio1;

import static org.junit.Assert.assertTrue;

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction (int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNum(){
		return this.numerator;
	}
	
	public int getDen(){
		return this.denominator;
	}
	
	public Fraction addFrac(Fraction x){
		int mult1 = this.denominator;
//		int mult2 = this.numerator;
		this.denominator = this.denominator * x.denominator;
		this.numerator = (x.denominator * this.numerator) + (mult1 * x.numerator);
		return new Fraction(this.numerator, this.denominator);
	}
	
	public Fraction multiFrac(Fraction x){
		this.numerator = this.numerator * numerator;
		this.denominator = this.denominator * denominator;
		return new Fraction(this.numerator,this.denominator);
	}
	
	public Fraction reciprocal(){
		int nph = this.numerator;
		int dph = this.denominator;
		this.denominator = nph;
		this.numerator = dph;
		return new Fraction(this.numerator, this.denominator);
		
	}
	public int lcm(int a, int b) {
		if (b == 0)
			return a;
		return lcm(b, a % b);
	}
	
	public Fraction simple(){
		int factor = lcm(this.numerator, this.denominator);
		return new Fraction(this.numerator/factor, this.denominator/factor);
	}
	
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction lame = new Fraction(1, 2);
		Fraction two = new Fraction(2, 8);
		System.out.println(two.simple());
	}

}
