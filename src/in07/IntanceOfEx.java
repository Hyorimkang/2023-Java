package in07;

public class IntanceOfEx {
	static void print(Person p) { 
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}//print

	public static void main(String[] args) {
		//Person p = new Student() 와 같은 표현 문장
		System.out.print("new Student() -> ");
		print(new Student());
		//Person p = new Researcher() 와 같은 표현 문장
		System.out.print("new Researcher() -> ");
		print(new Researcher());
		//Person p = new Professor() 와 같은 표현 문장
		System.out.print("new Professor() -> ");
		print(new Professor());
	}//main

}