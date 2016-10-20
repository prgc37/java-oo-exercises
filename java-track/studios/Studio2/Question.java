package Studio2;

import java.util.Scanner;

public class Question {
	protected String question;
	protected String answer;
	protected Scanner s;
	
	public Question(String question, String answer){
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion(){
		return this.question;
	}
	
	public String getAnswer(){
		return this.answer;
	}
	
	Scanner s1 = new Scanner(System.in);
	
	public boolean answerCorrect(){
		System.out.println(this.question);
		System.out.println("Please type your answer now: ");
		String response = s1.next();
		if (response == this.answer)
			return true;
		else
			return false;			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question stupid = new Question("Question?", "Answer.");
		System.out.println(stupid.getQuestion());
		System.out.println("");
		System.out.println(stupid.getAnswer());
		stupid.answerCorrect();

	}

}
