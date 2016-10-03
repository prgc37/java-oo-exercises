package Studio1;

public class Fraction {
	private int numerator;
	private int denominator;
	
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
	
//	public String addFrac(Fraction x){
//		this.numerator = this.numerator + numerator;
//		this.denominator = this.denominator + denominator;
//		return this.numerator + "/" + this.denominator;
//	}
//	
	public String multiFrac(Fraction x){
		this.numerator = this.numerator * numerator;
		this.denominator = this.denominator + denominator;
		return this.numerator + "/" + this.denominator;
	}
	
	public String reciprocal(){
		return "The reciprocal is: " + this.denominator + "/" + this.numerator;
		
	}
	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	public Fraction simple(){
		//ASK CHESter
		int factor = gcd(this.numerator, this.denominator);
		return new Fraction(this.numerator/factor, this.denominator/factor);
	}
	
	public String toString(){
		return "With a Numerator: " + this.numerator + " and the Denominator: " + this.denominator + ", giving us a fraction of: " + this.numerator + "/" + this.denominator;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction lame = new Fraction(7, 16);
		System.out.println(lame);
	}

}
