import static org.junit.Assert.*;

import org.junit.Test;

import Studio2.MultChoice;
import Studio2.Question;

public class QuestionTester {

	@Test
	public void testGetQuestion() {
		Question q = new Question("Question?", "Answer.");
		assertTrue(q.getQuestion() == "Question?");
	}
	
	@Test
	public void testGetAnswer() {
		Question q = new Question("Question?", "Answer.");
		assertTrue(q.getAnswer() == "Answer.");
	}

//	@Test
//	public void testAnswerCorrect() {
//		Question q = new Question("Question?", "Answer.");
//		assertTrue(q.answerCorrect() == "Answer.");
//	}
	
//	@Test
//	public void testGetAllChoices() {
//		MultChoice mc = new MultChoice("Question?", "Answer.", "WrongA", "WrongB", "WrongC");
//		assertTrue(mc.getAllChoices() == "Answer. WrongA WrongB WrongC");
//	}
	
}
