package in04;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		p=s;
		
		//Person p = new Student();  >> upcasting이 된다
		
		System.out.println(p.name);
		
		//p.grade = "A";
		//p.department = "Com";

	}

}
