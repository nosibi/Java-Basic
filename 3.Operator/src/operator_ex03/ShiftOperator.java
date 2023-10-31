package operator_ex03;

public class ShiftOperator {
	public static void main(String[] args) {
		// 산술 시프트
		
		// @ <<
		System.out.println(3 << 1); // 3 * (1*2)
		System.out.println(-3 << 1);
		System.out.println();
		
		// @ >>
		System.out.println(5 >> 1); // 5 / (1*2) -> 소수점 버림
		System.out.println(-5 >> 1); // -5 / (1*2) -> 소수점 올림
		System.out.println();		
		
		// 논리 시프트(>>>) -> 부호 상관없이 전체 비트를 오른쪽으로 이동
		System.out.println(3 >>> 1); // 000...011 >>> 1 -> 1
		System.out.println(-3 >>> 31); // 1111...100 >>> 31 하면 앞에서부터 0이 31개 채워지므로 000...1 = 2의 0승
		
	}

}
