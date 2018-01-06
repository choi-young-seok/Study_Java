package study.java.ch03.operator;

public class Operator04_InputNaNDataCheck {
	
	public static void main(String[] args) {
		//�Ǽ��� �Է¹��� �� �ݵ�� NaN�˻� �ǽ� 
		String userInput = "Nan";
		double value =  Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(value)){
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			value = 0.0; //�ʱ�ȭ
		}
		
		currentBalance += value;
		System.out.println(currentBalance);
	}

}
