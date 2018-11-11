package myTasks;

public class fclass1 {
	private int temp1;
	private int temp2;
	
	public fclass1(int temp1, int temp2) {
		this.temp1 = temp1;
		this.temp2 = temp2;
	}
	
	public static void main(String[] args) {
		fclass2 f2 = new fclass2(2, 2);
		
		f2.sum();
		f2.multiply();
	}

	public int getTemp1() {
		return temp1;
	}

	public int getTemp2() {
		return temp2;
	}
}
