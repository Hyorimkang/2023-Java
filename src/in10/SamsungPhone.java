package in10;

public class SamsungPhone implements PhoneInterface{
	//PhoneInterface에 있는 모든 메서드들을 써야 SamsungPhone에 오류 안남
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	//추가 메서드 작성(일반 메서드)
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
