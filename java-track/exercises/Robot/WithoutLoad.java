package Robot;

public class WithoutLoad implements RobotBehavior {
	
	protected int arms;
	protected int loadWeight;
	

	
	public WithoutLoad(int arms){
		this.arms = arms;
		this.loadWeight = 0;
	}

	@Override
	public boolean doNextMove() {
		if (loadWeight > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public int getFreeArms() {
		return this.arms;
	}

	@Override
	public int getLoadWeight() {
		return this.loadWeight;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
