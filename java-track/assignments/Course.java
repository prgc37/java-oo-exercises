import java.util.Arrays;
import java.util.*;

public class Course {
	
	protected String name;
	protected int credits;
	protected int seats_remaining;
	protected static int courseCount = 0;
	protected int seats = this.seats_remaining;
	protected ArrayList<Student> students = new ArrayList<Student>(seats);
	protected static ArrayList<Course> courses = new ArrayList<Course>(courseCount + 1);
	
	public Course(String name, int credits, int seats){
		this.name = name;
		this.credits = credits;
		this.seats_remaining = seats;
		courseCount += 1;
		courses.add(this);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public int getRemainingSeats(){
		return this.seats_remaining;
	}
	
	public boolean addStudent(Student a){
//		int nextIndex = 0;
		if(Arrays.asList(students).contains(a.getName()) || this.seats_remaining < 1)
			return false;
			else {
				students.add(a);
//				nextIndex++;
				this.seats_remaining--;
				return true;
			}
	}
	
	public double averageGPA(){
		double result = 0;
		for (Student a : students){
			result += a.getGPA();
		}
		double avGPA = result/students.size();
		return avGPA;
	}
	
	public ArrayList<Student> generateRoster(){
		students.removeAll(Arrays.asList(null,""));
		return students;
		
	}
	
	public static ArrayList<Course> getAllCourses(){
		return courses;
	}
//			Be sure to add some unit tests to test your new code! When doing so, keep in mind that your code will accumulate all Course objects created throughout your test file, and not just those created within a specific method.

	public static int getCourseCount(){
		return courseCount;
	}
	
	public String toString(){
		return "Name: " + this.name + ", Credits: " + this.credits + " Remaining Seats: " + this.seats_remaining + ".";
	}

	public static void main(String[] args) {
		
		Course h = new Course("History", 10, 20);
		Course c = new Course("Cooking", 5, 3);
		System.out.println(Course.getAllCourses());
		
	}

}
