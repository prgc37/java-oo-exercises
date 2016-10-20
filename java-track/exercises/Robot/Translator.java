package Robot;

public class Translator extends Robot{
	protected String baseLanguage;
	protected int vocabularySize;
	
	
	public Translator(String name, int x, int y, int speed, String direction, String baseLanguage, int vocabularySize){
		super(name, x, y, speed, direction);
		this.baseLanguage = baseLanguage;
		this.vocabularySize = vocabularySize;
	}
	
	public String getBaseLanguage(){
		return this.baseLanguage;
	}
	
	public int getVocabularySize(){
		return this.vocabularySize; 
	}
	
}
