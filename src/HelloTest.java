public class HelloTest {

	public static void main(String[] args) {
		int a = 123, b;
		double x = 345.678, y;
		
		y = a; //upcasting > 아버지A-자식B-손자D 이어짐  하지만!!!!!!!! 자식B-자식C은 안됨
		b =(int) x; //downcasting
		

	}

}
