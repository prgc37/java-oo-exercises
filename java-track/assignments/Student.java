
public class Student {
	private String first_name, last_name;
	private int student_id;
	private int credits;
	private double GPA;
	
	public Student(String first_name, String last_name, int student_id){
		this.first_name = first_name;
		this.last_name = last_name;
		this.student_id = student_id;
		this.credits = 0;
		this.GPA = 0.0;
	}
	
	public String getName(){
		return this.first_name + " " + this.last_name;
	}
	
	public int getStudentID(){
		return this.student_id;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public double getGPA(){
		return this.GPA;
	}
	
	public String getClassStanding(){
		int creds = this.credits;
		if (creds < 30)
			return "Freshman";
		else if (30 <= creds && creds < 60)
			return "Sophomore";
		else if (60 <= creds && creds < 90)
			return "Junior";
		else 
			return "Senior";
	}
	
	public void setGPA(double newGPA){
		this.GPA = newGPA;
	}
	
	public void setCredits(int newCredits){
		this.credits = newCredits;
	}
	
	
	public void submitGrade(double grade, int credHours){	
		double courseQscore = grade * credHours;
		double oldQscore = this.credits * this.GPA;
		double newQscore = oldQscore + courseQscore;
		this.credits += credHours;
		double GPA = newQscore/this.credits;
		this.GPA = (double)Math.round(GPA * 1000) / 1000; //round to three decimal places
	}
	
	public double computeTuition(){
		if (this.credits % 15 == 0)
			return (this.credits/15) * 20000;
		else
			return (Math.round(this.credits/15)) * 20000 + (this.credits % 15) * 1333.33;
	}
	
	public static Student createLegacy(Student a, Student b){
		String baby_first_name = a.getName();
		String baby_last_name = b.getName();
		int baby_SID = a.getStudentID() + b.getStudentID();
		double baby_GPA = (a.getGPA() + b.getGPA())/2.0;
		int baby_credits = 0;
			if (a.getCredits() > b.getCredits())
				baby_credits = a.getCredits();
			else
				baby_credits = b.getCredits();
		Student baby = new Student(baby_first_name, baby_last_name, baby_SID);
		baby.setGPA(baby_GPA);
		baby.setCredits(baby_credits);
		return baby;
	}
	
	public String toString(){
		return "Name: " + this.getName() + ", Student ID Number: " + this.student_id + ", Credits: " + this.credits + ", GPA: " + this.GPA + ", Year in School: " + this.getClassStanding();
	}

	public static void main(String[] args) {
		Student s = new Student("Doug", "Shook", 12345);
		s.GPA = 4.0;
		s.credits = 0;
		s.submitGrade(4, 10);
		System.out.println("");
		s.submitGrade(2, 10);
		System.out.println(s);

	}

}
