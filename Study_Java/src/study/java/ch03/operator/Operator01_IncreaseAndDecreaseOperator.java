package study.java.ch03.operator;

public class Operator01_IncreaseAndDecreaseOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		x++; // x = x + 1과 동일
		++x; // x = x + 1과 동일
		System.out.println("x : " + x); // 기존 x의 값(10)에 1을 더해 그 결과를 다시 x에 할당
		
		System.out.println("-----------------------\n");
		y--; // y = y - 1과 동일
		--y; // y = y - 1과 동일
		System.out.println("y : " + y);
		
		System.out.println("-----------------------\n");
		z = x++; 
		// z = x;, x = x + 1과 동일
		// 증감연산자(++, --)만 사용 경우 연산자의 위치에 따른 전위연산, 후위연산은 동일한 값을 출력하지만
		// 다른 연산자와 같이 사용될 경우 연산자 우선순위에 의해 연산자가 수행된다.
		// 따라서 z = x++;의 후위연산은
		// 연산자 우선순위에 따라 z = x가 먼저 수행되고 
		// 그이 후 x++(x = x + 1)연산이 수행됨에 따라
		// 최종적으로 z는 13이 아닌 12의 값을 가지게 된다
		// 주의 : x++; 연산이 먼저 이루어져서 기존 x값인 12에 1을 더한 13의 값을 z변수에 할당하는 것이 아님을 연산자 우선순위에 유의 하며 주의
				
		System.out.println("z : " + z);
		System.out.println("x : " + x);

		System.out.println("-----------------------\n");
		z = ++x;
		// 기존 x값 13에 1을 더하는 연산을 수행한 뒤 (x = x +1)
		// 전위 증감연산의 결과를 변수 z에 할당 (z = x)
		// 따라서 최종적으로 x = x + 1연산 이후의 x의 결과값을 z에 할당
		
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		
		System.out.println("-----------------------\n");
		z = ++x + y++;
		// 가장 먼저 수행되는 전위증감 연산자를 수행 x++ (x = x + 1)
		// 두번째로 + 연산자 수행 x + y (15 + 8)
		// 세번째로 = 연산자 수행 z = 23
		// 마지막으로 후위증감 연산자를 수행 y++ (y = y + 1) 
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("-----------------------\n");
	}

}
