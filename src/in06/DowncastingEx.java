package in06;

public class DowncastingEx {
	public static void main(String[] args) {
		Person p  = new Student("이재문");
		//p는 Person class를 가리키는 객체변수이지만 
		//Student객체를 할당받아 Upcasting발생함 
		
		Student s;
		//s는 Student class를 가리키는 객체변수로 선언(메모리할당받지못함)
		
		s= (Student)p;
		//s는 upcasting 된 p객체 변수를 가지고 Student class로 downcasting하면 
		//Student class의 객체를 할당 받는것과 같다
		//따라서 Student s = new Student() <= 이 문장과 같은 효과를 가짐
		//downcasting은 반드시 upcasting된 객체변수를 가지고 해야함!!!!
		
		System.out.println(s.name);
		s.grade="A";
		s.name = "B";
	}
}
