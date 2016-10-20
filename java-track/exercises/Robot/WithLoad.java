package Robot;

public class WithLoad implements RobotBehavior {
	
	protected int arms;
	protected int armCapacity;
	protected int armsInUse;
	protected int freeArms;
	protected int loadWeight;
	protected int surplusCap = (this.armCapacity * this.arms) - loadWeight;
	
	
	
	public WithLoad(int arms, int loadWeight){
		this.arms = arms;
		this.loadWeight = loadWeight;
	}
	
	public int getArms(){
		return this.arms;
	}
	
	public int getArmCapacity(){
		return this.armCapacity;
	}
	
	public int getArmsInUse(){
		return this.armsInUse;
	}
	
	public int getSurplusCap(){
		return this.surplusCap;
	}
	
	@Override
	public boolean doNextMove() {
		if (surplusCap < loadWeight)
			return false;
		else
			return true;
	}
	
	@Override
	public int getFreeArms() {
		return this.arms - this.armsInUse;
	}

	@Override
	public int getLoadWeight() {
		return this.loadWeight;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {


	}

}
