package calc;
/*
 * 사칙 연산 클래스
 */
public class Calc {
	
	// 인스턴스를 안만들고 바로 호출 가능
	public static int plus2(int num1, int num2) {
		return num1 + num2;
	}

	// 더하기 메소드
	public int plus(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("두수의 더하기: " + result);
		return num1 + num2;
	}
	// 빼기 메소드
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	// 곱하기 메소드
	public int multi(int num1, int num2) {
		return num1 * num2;
	}
	// 나누기 메소드
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	// 돈 복사기 메소드(3배 뻥튀기)
	public int pung(int m) {
//		System.out.println("m = " + m * 3);
		return m * 3;
	}
}
