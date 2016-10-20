package Studio2;

public class MultChoice extends Question{
	protected String wrongA;
	protected String wrongB;
	protected String wrongC;
	
	public MultChoice(String question, String answer, String wrongA, String wrongB, String wrongC){
		super(question, answer);
		this.wrongA = wrongA;
		this.wrongB = wrongB;
		this.wrongC = wrongC;
	}
	
	public String getWrongA(){
		return this.wrongA;
	}
	
	public String getWrongB(){
		return this.wrongB;
	}
	
	public String getWrongC(){
		return this.wrongC;
	}
	
	public String getAllChoices(){
		return this.answer + " " + this.wrongA + " " + this.wrongB + " " + this.wrongC;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultChoice mc = new MultChoice("Question?", "Answer.", "WrongA", "WrongB", "WrongC");
		System.out.println(mc.getAllChoices());
	}

}
