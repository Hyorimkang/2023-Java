package in10;

interface PhoneInterface {
	int TIMEOUT=10000;  //상수 (public static final이 생략)
	
	void sendCall(); //추상메서드 (abstract키워드 생략)
	void receiveCall(); //추상메서드 (abstract키워드 생략)
	
	//interface에 일반메서드 못오는데 default붙이면 가능하게 
	//해달라는개발자들 요청에 의해 오라클이 기능을 추가한것
	default void printLogo() { 
		System.out.println("** phone **");
	}

}
