
public class Laptop extends Computer {

	private boolean isClosed;
	
	public Laptop(int memory, double size, double processor, String brand){
		super(memory, size, processor, brand);
		this.isClosed = true;
	}
	
	public void close(){
		this.isClosed = true;
	}
	
	public void open(){
		this.isClosed = false;
	}
	
//	ArrayList<Computer> computers = new ArrayList<Computer>(size);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop(8, 15, 1000, "dell");
		Tablet t = new Tablet(4, 10, 100, "apple");
		Computer c = new Computer(2, 12, 100000, "MyShit");
		l.close();
		
		System.out.println(l.getBrand());
		System.out.println(t.getBrand());
		System.out.println(c.getBrand());
	}

}
