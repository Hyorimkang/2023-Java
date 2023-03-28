package in08;

public class Circle extends Shape{
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape"; //super는 아버지클래스(Shape)에 있는걸 호출
		super.draw();
		System.out.println(name);
	}//draw

	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();

	}

}
