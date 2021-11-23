package calc;

public class MainClass {

	public static void main(String[] args) {
		// 계산기를 만들어보자
		// 두개의 정수
		int num1 = 5;
		int num2 = 3;
		int result = 0; 
		
		// 더하기
		calc cc1 = new calc();
		result = cc1.plus(num1, num2);
		System.out.println("num1 + num2 = " + result);
		
		// 빼기
		calc cc2 = new calc();
		result = cc2.minus(num1, num2);
		System.out.println("num1 - num2 = " + result);
		
		// 곱하기
		calc cc3 = new calc();
		result = cc3.multiplication(num1, num2);
		System.out.println("num1 * num2 = " + result);
		
		// 나누기
		calc cc4 = new calc();
		result = cc4.division(num1, num2);
		System.out.println("num1 / num2 = " + result);
		
		// 나머지
		calc cc5 = new calc();
		result = cc5.rest(num1, num2);
		System.out.println("num1 % num2 = " + result);
		
		
		
	}

}
