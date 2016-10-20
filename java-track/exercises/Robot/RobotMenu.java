package Robot;
import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {

	private ArrayList<Robot> robots;
	private Scanner s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 5); 
		
	}
	
	public RobotMenu(){
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu(){
		System.out.println("This is the robot menu: ");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option: ");
		int selection = s.nextInt();
		while (selection < 0 || selection > 6) {
			System.out.println("Invalid selection, please try again: ");
		}
		return selection;
	}
	
	public void processInput(int selection){
		if (selection == 1) {
			createRobot();
		}
		else if (selection == 2){
			displayRobots();
		}
		else if (selection == 3){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter a direction ('N', 'S', 'E', or 'W'), a speed, and a distance for the robot to move.");
			String direction = s.next();
			if (direction != "N" || direction != "S" || direction != "E" || direction != "W"){
				System.out.println("Invalid direction value. Please enter either 'N', 'S', 'E', or 'W'");
				direction = s.next();
			}
			int speed = s.nextInt();
			while (speed < 1){
				System.out.println("Invalid value. Please enter a positive number.");
				speed = s.nextInt();
			}
			int distance = s.nextInt();
			while (distance < 1){
				System.out.println("Invalid distance value. Please enter a positive number.");
				distance = s.nextInt();
			}
			r.move(direction, speed, distance);
			System.out.println("Here is the robot's status after we the move: ");
			System.out.println(r);
		}
		else if(selection == 4){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Which way would you like to rotate the robot, 'right' or 'left'?");
			String rotate = s.next();
			if(rotate != "right" || rotate != "left"){
				System.out.println("Invalid input, please enter either 'right' or 'left'.");
				rotate = s.next();
			}
			r.rotate(rotate);
			System.out.println("Here is what the computer looks like after the rotation: ");
			System.out.println(r);
		}
		else if (selection == 5) {
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter the X and Y coordinates of the robot or object you'd like to compute the distance to: ");
			int xCo = s.nextInt();
			if (Character.isDigit(xCo)){
				xCo = xCo;
			}
			else {
				System.out.println("Please enter a numeral for the object's X coordinate: ");
				xCo = s.nextInt();
			}
			int yCo = s.nextInt();
			if (Character.isDigit(yCo)){
				yCo = yCo;
			}
			else {
				System.out.println("Please enter a numeral for the object's Y coordinate: ");
				yCo = s.nextInt();
			}
			r.getDistanceTo(xCo, yCo);
			System.out.println("Here is the robot's current status, including distance to your selected object(point)");
			System.out.println(r);
		}
	}
	
	public void displayRobots(){
		for(int i = 0; i < robots.size(); i++){
			System.out.println((i + 1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void createRobot(){
		System.out.println("Please enter the name of the robot: ");
		String name = s.next();
		System.out.println("Please enter the starting X coordinate for the robot: ");
		int xCo = s.nextInt();
		System.out.println("Please enter the starting Y coordinate for the robot: ");
		int yCo = s.nextInt();
		System.out.println("Please enter a speed for the robot: ");
		int speed = s.nextInt();
		while(speed < 1){
			System.out.println("Invalid speed value. Please enter a positive number.");
			speed = s.nextInt();
		} 
		System.out.println("Please enter a starting direction (orientation) for the robot: ");
		String direction = s.next();
		if (direction != "N" || direction != "S" || direction != "E" || direction != "W"){
			System.out.println("Invalid direction value. Please enter either 'N', 'S', 'E', or 'W'");
			direction = s.next();
		}
		int toX = 0;
		int toY = 0;
		
		robots.add(new Robot(name, xCo, yCo, speed, direction));
	}


}
