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
		
		result[3] = x / y; // 몫을 구하는 연산
		System.out.println("result[3] : " + result[3]);
		
		result[4] = x % y; // 나머지를 구하는 연산
		System.out.println("result[4] : " + result[4]);
		
		/* 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 
		 * 학생당 몇 개를 가질 수 있고, 최종적으로 몇개가 남는지를 구하시오*/
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println("학생당 분배된 연필의 수 : " + pencilsPerStudent + "자루" );
		
		int givingPencils = pencilsPerStudent * students;
		System.out.println("분배된 연필의 총 수 : " + givingPencils);
		
		int pencilsLeft = pencils % students;
		System.out.println("분배 후 남은 연필의 수 : " + pencilsLeft + "자루");
		
		/*변수 value의 값이 356일 때 10의 자리 이하를 버리는 코드를 작성하시오
		 * (단, 산술 연산자만을 사용할것)*/
		
		int value = 356;
		System.out.println((value / 100) * 100);
		
		/*밑변이 10, 높이가 7, 윗변이 5인 사다리꼴의 넓이를 구하시오
		 * (단, 결과값은 소수자릿수가 나올수 있도록 처리하시오)*/
		
		int lengthTop = 5; 
		int lengthBottom = 10;
		int height = 7;
		
		double area = (double)((lengthTop + lengthBottom) * height) / 2;
		System.out.println(area);
		
		/*다음 % 연산을 수행한 결과값에 10을 더하는 코드에 
		 * NaN 값을 검사해서 올바른 결과가 출력될 수 있도록
		 * NaN을 검사하는 코드를 작성하시오*/
		
		double a = 5.0;
		double b = 0.0;
		
		double result1 = a % y;
		System.out.println(result1);
		
		if(Double.isNaN(result1)){
			System.out.println("0.0으로 나눌 수 없음");
		} else{
			double result2 = result1 + 10;
			System.out.println("결과 : " +result2);
		}
		
		
		
	}
}
