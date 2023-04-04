package in11;

interface PhoneInterface { //인터페이스 선언
	int TIMEOUT = 10000; //상수필드선언
	void sendCall(); //추상메소드
	void receiveCall(); //추상메소드
	default void printLogo() { //default 메소드
		System.out.println("** phone **");
	}
}
