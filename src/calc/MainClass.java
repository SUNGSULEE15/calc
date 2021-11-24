package calc;

import com.hsj.util.Util;

public class MainClass {

	public static void main(String[] args) {
		// 계산기를 만들어 보자
		System.out.println("계산기 프로그램");
		System.out.println("오늘날짜");
		System.out.println(Util.getCurrentDate("yyyyMMdd"));

		//두개의 정수 입력받기
		// 계산기 클래스를 선언(객체생성, 인스턴스 생성)
//		Calc2 cc2 = new Calc2();
//		do {
//			// 두개의 숫자를 입력
//			System.out.println("두개의 숫자를 입력하시오: ");
//			cc2.inputNumber();
//			// 연산자를 입력하시오
//			System.out.println("연산자를 입력하시오: ");
//			cc2.inputOper();
//		} while(! cc2.checkNum()); // 여기에서 수를 체크
//		// 수 체크2
//		cc2.checkNum();
//		// 결과
//		cc2.printResult();
		
		
		Calc3 cc3 = new Calc3();
		// 입력
		cc3.inputNum();
		// 연산자를 입력 받고
		cc3.inputOp();
		// 출력
		cc3.printResult();

	}

}
