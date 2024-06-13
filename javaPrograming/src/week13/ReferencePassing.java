package week13;


class Circles {
	int radius;
	
	public Circles(int radius) {
		this.radius = radius;
	}
}

public class ReferencePassing {								// 기본 클래스
	
	static void increase(Circles m) {						
		m.radius++;
	}
	
	public static void main(String[] args) {				// 메인 메소드
		Circles pizza = new Circles(10);
		
		increase(pizza);
		
		System.out.println(pizza.radius);

	}

}
