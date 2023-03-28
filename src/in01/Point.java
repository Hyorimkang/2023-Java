package in01;

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public void set(int x, int y) { // 스택영역에 저장되어있어 method가 종료되면 사라짐
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

