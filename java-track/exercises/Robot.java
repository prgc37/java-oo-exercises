
public class Robot {
	
	private String name;
	private int xCo;
	private int yCo;
	private int speed;
	private String direction;
	int toX;
	int toY;
	
	public Robot(String name, int xCo, int yCo, int speed, String direction, int toX, int toY) {
		this.name = name;
		this.xCo = xCo;
		this.yCo = yCo;
		this.speed = speed;
		this.direction = direction;
		this.toX = toX;
		this.toY = toY;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getX(){
		return this.xCo;
	}
	
	public int getY(){
		return this.yCo;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public String getDirection(){
		return this.direction;
	}
	
	public void setSpeed(int newSpeed){           //add JUNIT test
		this.speed = newSpeed;
	}
	
	public void move(String direction, int speed, int distance){
		this.direction = direction;
		this.speed = speed;
		if (this.direction == "N") {
			this.yCo += distance;
		}
		else if (this.direction == "S"){
			this.yCo -= distance;
		}
		else if (this.direction == "E"){
			this.xCo += distance;
		}
		else if (this.direction == "W"){
			this.xCo -= distance;
		}
		else {
			System.out.println("Please enter either 'N', 'S', 'E', or 'W'");
		}
	}
	
	public void rotate(String rotate) {
		if (rotate == "left"){
			if (direction == "N"){
				direction = "W";
			}
			else if (direction == "S"){
				direction = "E";
			}
			else if (direction == "E"){
				direction = "N";
			}
			else {
				direction = "S";
			}
		}
		else if (rotate == "right") {
			if (direction == "N"){
				direction = "E";
			}
			else if (direction == "S"){
				direction = "W";
			}
			else if (direction == "E"){
				direction = "S";
			}
			else {
				direction = "N";
			}
		}
		else {
			System.out.println("Please enter either 'left' or 'right' ...theeeenks!");
		}
	}
	
	public String getDistanceTo(int xCo, int yCo){
		//Determine Distance (from other robot or object)
		if (this.xCo > 0 && xCo > 0){
			if (this.xCo > xCo){
				this.toX = this.xCo - xCo;
			}
			else {
				this.toX = xCo - this.xCo;
			}
		}
		else if (this.xCo > 0 && xCo < 0){
			this.toX = this.xCo + Math.abs(xCo);
		}
		else if (this.xCo < 0 && xCo > 0){
			this.toX = Math.abs(this.xCo) + xCo;
		}
		else if (this.xCo < 0 && xCo < 0){
			if (this.xCo > xCo){
				this.toX = Math.abs(xCo) - Math.abs(this.xCo);
			}
			else {
				this.toX = Math.abs(this.xCo) - Math.abs(xCo);
			}
		}
		else {
			System.out.println("Dude...that just screwed up my head");
		}
		
		
		if (this.yCo > 0 && yCo > 0){
			if (this.yCo > yCo){
				this.toY = this.yCo - yCo;
			}
			else {
				this.toY = yCo - this.yCo;
			}
		}
		else if (this.yCo > 0 && yCo < 0){
			this.toY = this.yCo + Math.abs(yCo);
		}
		else if (this.yCo < 0 && yCo > 0){
			this.toY = Math.abs(this.yCo) + yCo;
		}
		else if (this.yCo < 0 && yCo < 0){
			if (this.yCo > yCo){
				this.toY = Math.abs(yCo) - Math.abs(this.yCo);
			}
			else {
				this.toY = Math.abs(this.yCo) - Math.abs(yCo);
			}
		}
		else {
			System.out.println("Dude...that just screwed up my head");
		}
		return "The X coordinate distance = " + toX + "and the Y coordinate distance = " + toY;
		
	}

	public String toString(){
		return "Name: " + this.name + ", the X coordinate: " + this.xCo + ", the Y coordinate: " + this.yCo + ", Speed: " + this.speed + ", the direction the robot is facing: " + direction + ", distance to target (X): " + toX + ", distance to target (Y): " + toY;
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot firstRobot = new Robot("Kit9", 5, 10, 2, "N", 0, 0);
//		System.out.println(firstRobot.name);
//		System.out.println(firstRobot.direction);
//		firstRobot.rotate("left");
//		System.out.println(firstRobot.direction);
//		firstRobot.rotate("right");
//		System.out.println(firstRobot.direction);
		System.out.println(firstRobot);
		firstRobot.move("W", 3, 5);
		System.out.println(firstRobot);
		
	}
}
