package calc;

public class MainClass {

	public static void main(String[] args) {
		// ���⸦ ������
		// �ΰ��� ����
		int num1 = 5;
		int num2 = 3;
		int result = 0; 
		
		// ���ϱ�
		calc cc1 = new calc();
		result = cc1.plus(num1, num2);
		System.out.println("num1 + num2 = " + result);
		
		// ����
		calc cc2 = new calc();
		result = cc2.minus(num1, num2);
		System.out.println("num1 - num2 = " + result);
		
		// ���ϱ�
		calc cc3 = new calc();
		result = cc3.multiplication(num1, num2);
		System.out.println("num1 * num2 = " + result);
		
		// ������
		calc cc4 = new calc();
		result = cc4.division(num1, num2);
		System.out.println("num1 / num2 = " + result);
		
		// ������
		calc cc5 = new calc();
		result = cc5.rest(num1, num2);
		System.out.println("num1 % num2 = " + result);
		
		
		
	}

}
