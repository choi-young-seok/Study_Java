package study.java.ch03.operator;

public class Operator02_AritmeticOperator {
	public static void main(String[] args) {
		int x = 5;
		int y = 2;

		int result[] = new int[6];
		
		result[0] = x + y;
		System.out.println("result[0] : " + result[0]);

		result[1] = x - y;
		System.out.println("result[1] : " + result[1]);
		
		result[2] = x * y;
		System.out.println("result[2] : " + result[2]);
		
		result[3] = x / y; // ���� ���ϴ� ����
		System.out.println("result[3] : " + result[3]);
		
		result[4] = x % y; // �������� ���ϴ� ����
		System.out.println("result[4] : " + result[4]);
		
		/* 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� 
		 * �л��� �� ���� ���� �� �ְ�, ���������� ��� �������� ���Ͻÿ�*/
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println("�л��� �й�� ������ �� : " + pencilsPerStudent + "�ڷ�" );
		
		int givingPencils = pencilsPerStudent * students;
		System.out.println("�й�� ������ �� �� : " + givingPencils);
		
		int pencilsLeft = pencils % students;
		System.out.println("�й� �� ���� ������ �� : " + pencilsLeft + "�ڷ�");
		
		/*���� value�� ���� 356�� �� 10�� �ڸ� ���ϸ� ������ �ڵ带 �ۼ��Ͻÿ�
		 * (��, ��� �����ڸ��� ����Ұ�)*/
		
		int value = 356;
		System.out.println((value / 100) * 100);
		
		/*�غ��� 10, ���̰� 7, ������ 5�� ��ٸ����� ���̸� ���Ͻÿ�
		 * (��, ������� �Ҽ��ڸ����� ���ü� �ֵ��� ó���Ͻÿ�)*/
		
		int lengthTop = 5; 
		int lengthBottom = 10;
		int height = 7;
		
		double area = (double)((lengthTop + lengthBottom) * height) / 2;
		System.out.println(area);
		
		/*���� % ������ ������ ������� 10�� ���ϴ� �ڵ忡 
		 * NaN ���� �˻��ؼ� �ùٸ� ����� ��µ� �� �ֵ���
		 * NaN�� �˻��ϴ� �ڵ带 �ۼ��Ͻÿ�*/
		
		double a = 5.0;
		double b = 0.0;
		
		double result1 = a % y;
		System.out.println(result1);
		
		if(Double.isNaN(result1)){
			System.out.println("0.0���� ���� �� ����");
		} else{
			double result2 = result1 + 10;
			System.out.println("��� : " +result2);
		}
		
		
		
	}
}
