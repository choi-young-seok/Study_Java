package study.java.ch03.operator;

public class Operator03_NaNAndInfinityOperation {

		public static void main(String[] args) {
			int x = 5;
			int y = 0;
			
			try {
				int infinityError = x / y;
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
				e.printStackTrace();
			}
			
			try {
				int NanError = x % y;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
}
