package Studio1;

public class BaseballPlayer {
	private String name;
	private int number;
	private String bat_hand;
	private int hits;
	private int RBIs;
	private int HRs;
	private int GP;
	
	public BaseballPlayer(String name, int number, String bat_hand){
		this.name = name;
		this.number = number;
		this.bat_hand = bat_hand;
		this.hits = 0;
		this.RBIs = 0;
		this.HRs = 0;
		this.GP = 0;
		
	}
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getHand() {
		return this.bat_hand;
	}
	
	public int getHits() {
		return this.hits;
	}
	
	public int getHRs() {
		return this.HRs;
	}
	
	public int getRBIs() {
		return this.RBIs;
	}
	
	public int getGP() {
		return this.GP;
	}
	
	public void playGame() {
		this.GP += 1;
	}
	
	public void hitRun() {
		this.HRs += 1;
	}
	
	public void earnRBI() {
		this.RBIs +=1;
	}
	
	public void hit() {
		this.hits += 1;
	}
	
	public String toString(){
		return "Name: " + this.name + ", Jersey Number: " + this.number + ", Batting Hand: " + this.bat_hand + ", Hits: " + this.hits + ", Runs Batted In: " + this.RBIs + ", Home Runs: " + this.HRs + ", Games Played: " + this.GP;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer Gretzky = new BaseballPlayer("Wayne", 99, "Right");
		System.out.println(Gretzky);
	}

}
