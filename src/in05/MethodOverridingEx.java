package in05;

public class MethodOverridingEx {
	
	public static void main(String[] args) {
		Line line = new Line();
		Shape p = line; //p는 Shape class를 가리키는 객체변수인데 line 객체를 할당받아 upcasting됨
		p.a = 234;
		p.b = 345.67;
		p.shapedraw();
		p.draw(); 
		//p는 Shape class의 모든 멤버의 접근할 수 있는데, 
		//오버라이딩(재정의)된 메소드는 하위클래스의 메소드를 호출함
	}
}
