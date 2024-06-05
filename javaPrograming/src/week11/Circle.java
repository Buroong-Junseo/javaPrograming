package week11;

public class Circle {
	int radius;
	String name;
	
	public Circle() { }
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;											// circle 클래스에 피자객체 생성
		pizza = new Circle();									// 초기화
		pizza.radius = 10;										// 위에 선언했던 radius에 정수 값 입력
		pizza.name = "자바피자";									// 위에 선언했던 name에 문자열 값 입력
		double area = pizza.getArea();							// 소수점 사용 간능한 정수형 area 선언, getArea 메소드 계산값 입력
		System.out.println(pizza.name + "의 면적은 " + area);		
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
