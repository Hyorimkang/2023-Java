package in03;


public class ColorPoint extends Point{
	private String color; // 점의 색
	
	public ColorPoint(int x, int y, String color) {
		super(x,y); //super() method는 한개만 존재
		this.color = color;
		//super(x,y); >> 반드시 첫줄에 작성해야함
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
