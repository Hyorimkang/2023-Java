package in02;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길순";
		height = 175;
		// weight = 99;  > private라 접근 불가
		setWeight(99);
		}
}
