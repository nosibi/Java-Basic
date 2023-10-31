package operator_ex05;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자
		// AND(&&)
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true&&(5 < 3));
		System.out.println((5 <= 5)&&(7 > 2));
		System.out.println(false&&true); //쇼트서킷 적용. 우변은 실행되지 않는다
		System.out.println("-------------");
		
		//OR(||)
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(true||(5 < 3));
		System.out.println((5 <= 5)||(7 > 2));
		System.out.println("-------------");
		
		//XOR(^)
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^(5 < 3));
		System.out.println((5 <= 5)^(7 > 2));
		System.out.println("--------------");
		
		//NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false|| !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));
		System.out.println("-------------");
		
		// 비트 연산자로 논리 연산 수행(쇼트 서킷 적용되지 않음)
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();
		
		// 쇼트 서킷 사용 여부(논리 연산자 적용, 비트 연산자 미적용)
		int value1 = 3;
		System.out.println(false && ++value1 > 6);
		//논리연산자 AND는 둘 다 true여야 true를 출력하므로 좌항만 봐도 결과가 정해진다.
		//따라서, 우측항은 실행 시키지 않는 쇼트 서킷이 적용되므로 증감연산자가 실행되지 않는다.
		System.out.println(value1); //3
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); //쇼트 서킷이 적용되지 않으므로 증감연산자 실행
		System.out.println(value2); //4
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6); //OR은 하나만 true여도 true를 출력하므로 쇼트서킷 적용
		System.out.println(value3); //3
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4); // 4
		
	}

}
