package calc;
/*
 * ��Ģ���� Ŭ����
 */
public class calc {
	// ���ϱ� �޼ҵ�
	public int plus(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("�� ���� ���ϱ�: " +  result);
		return num1 + num2;
	}
	// ���� �޼ҵ�
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	// ���ϱ� �޼ҵ�
	public int multiplication(int num1, int num2) {
		return num1 * num2;	
	}
	
	// ������ �޼ҵ�
	public int division(int num1, int num2) {
		return (num1 / num2);
	}
	
	// ������ �޼ҵ�
	public int rest(int num1, int num2) {
		return (num1 % num2);
	}
}