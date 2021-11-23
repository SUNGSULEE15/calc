package calc;
/*
 * 사칙연산 클래스
 */
public class calc {
	// 더하기 메소드
	public int plus(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("두 수의 더하기: " +  result);
		return num1 + num2;
	}
	// 빼기 메소드
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	// 곱하기 메소드
	public int multiplication(int num1, int num2) {
		return num1 * num2;	
	}
	
	// 나누기 메소드
	public int division(int num1, int num2) {
		return (num1 / num2);
	}
	
	// 나머지 메소드
	public int rest(int num1, int num2) {
		return (num1 % num2);
	}
}