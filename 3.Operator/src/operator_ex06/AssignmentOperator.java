package operator_ex06;

public class AssignmentOperator {
	public static void main(String[] args) {
		//대입 연산자와 축약 표현
		//대입 연산자
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		//축약 표현
		int value2;
		value2 = 5; System.out.println(value2 += 2);
		value2 = 5; System.out.println(value2 -= 2);
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2);
	}
	

}
