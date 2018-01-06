package study.java.ch03.operator;

public class Operator04_InputNaNDataCheck {
	
	public static void main(String[] args) {
		//실수를 입력받을 시 반드시 NaN검사 실시 
		String userInput = "Nan";
		double value =  Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(value)){
			System.out.println("NaN이 입력되어 처리할 수 없음");
			value = 0.0; //초기화
		}
		
		currentBalance += value;
		System.out.println(currentBalance);
	}

}
