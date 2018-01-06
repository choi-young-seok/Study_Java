package study.java.ch03.operator;

public class Operator06_ConditionalOperation {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점의 학점은 " + grade + "입니다.");
	}
}
