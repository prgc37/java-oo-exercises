package Robot;

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
		// TODO Auto-generated method stub

	}

}
