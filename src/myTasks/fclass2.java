package myTasks;

public class fclass2 extends fclass3{

	public fclass2(int temp1, int temp2) {
		super(temp1, temp2);
	}
	
	public void sum() {
		System.out.println("����� 2� ��������� = " + (getTemp1() + getTemp2()));
	}
	
	public void multiply() {
		System.out.println("��������� 2� ��������� = " + (getTemp1() * getTemp2()));
	}

}
