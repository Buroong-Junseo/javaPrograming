package week13;

class Calc {
	public static int abs(int a) { 
		return a > 0 ? a : -a; 			//a가 0보다 크다면 a를 써주고, 그렇지 않다면 -a를 써라 (a의 양수, 음수 여부 체크)
		}
	public static int max(int a, int b) { 
		return (a > b) ? a : b; 		// a가 b보다 크다면 a를 써주고, 그렇지 않다면 b를 써라 (a와 b 비교, 큰값 반환)
		}
	public static int min(int a, int b) { 
		return (a > b) ? b : a;			// a가 b보다 크다면 b를 써주고, 그렇지 않다면 a를 써라 (a와 b 비교, 작은값 반환)
	}
}


public class CalcEx {

	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}
