import Robot.WithLoad;

public class Carrier extends Robot{
	protected int arms;
	protected int armCapacity;

	public Carrier(String name, int x, int y, int speed, String direction, int arms, int armCapacity){
		super(name, x, y, speed, direction);
		this.arms = arms;
		this.armCapacity = armCapacity;
	}
	
	public int getArms(){
		return this.arms;
	}
	
	public int getArmCapacity(){
		return this.armCapacity;
	}
	
	public static void main(String[] args) {
		Carrier c = new Carrier("CarC", 0, 0, 1, "N", 4, 200);
		c.setBehavior(new WithLoad(c.getArms(), 750));
		Carrier d = new Carrier("CarD", 0, 0, 1, "S", 2, 400);
		System.out.println(c.getDistanceTo(10, 5));
		
//		You are now ready to try out your strategies! In a main method (or some other appropriate method). Do the following:
//
//		    Create a Robot
//		    Create one of your strategies and set it with setBehavior()
//		    Repeat this process for a second robot
//		    Create a loop that continuously calls doNextMove() for both robots and then prints out their information
//		    End the loop when one or both Robots achieves its goal


	}

}
