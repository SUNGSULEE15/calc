package calc;

import com.hsj.util.Util;

public class MainClass {

	public static void main(String[] args) {
		// 계산기를 만들어 보자
		System.out.println("계산기 프로그램");
		System.out.println("오늘날짜");
		System.out.println(Util.getCurrentDate("yyyyMMdd"));
		// 두개의 정수
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		// 더하기
//		result = num1 + num2;
		calc cc = new calc();
		result =  cc.plus(num1, num2);
		System.out.println("두수의 더하기: " + result);
		
		System.out.println("static 을 사용한 두수의 더하기: " + calc.plus2(num1, num2));
		
		
//		// 빼기
//		result = num1 - num2;
//		System.out.println("두수의 빼기: " + result);
//		// 곱하기
//		result = num1 * num2;
//		System.out.println("두수의 곱기: " + result);
//		// 나누기
//		result = num1 / num2;
//		System.out.println("두수의 나누기: " + result);
		
		Test test = new Test();
		test.method();
		
		int myMoney = 1000;
		System.out.println("길을 가다가 돈 복사기를 주웠네");
		System.out.println("내 돈 " + myMoney + "원을 넣어 보자");
		// 돈 복사기 호출
		myMoney = cc.pung(myMoney);
		System.out.println("두구두구두구~ 내돈은 " + myMoney + "원!!!");

	}
}
