package study.java.ch03.operator;

public class Operator05_LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮��");
		} else if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("�ҹ���");
		} else if (!(charCode >= 48) & !(charCode <= 57)) {
			System.out.println("0~9 ����");
		}

		int value = 6;
		
		if( (value % 2 == 0) || (value % 3 == 0) || (value % 2 == 0) | (value % 3 == 0) ){
			System.out.println("2 �Ǵ�(||, |) 3�� ���");
		}
	}
}
