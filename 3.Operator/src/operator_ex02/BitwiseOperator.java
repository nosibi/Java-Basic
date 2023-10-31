package operator_ex02;

public class BitwiseOperator {
	public static void main(String[] args) {
		//자바 메서드로 진법 변환
		int data = 13; //10진수를
		System.out.println(Integer.toBinaryString(data)); //2진수로 변환
		System.out.println(Integer.toOctalString(data)); //8진수로 변환
		System.out.println(Integer.toHexString(data)); //16진수로 변환
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2)); //2진수로 변환
		System.out.println(Integer.parseInt("15", 8)); //8진수로 변환
		System.out.println(Integer.parseInt("0D", 16)); //16진수로 변환
		System.out.println();
		
		//비트 연산자
		
		// AND : 둘 다 1이어야 1출력. 그 외에는 0 출력
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println();
		
		// OR : 둘 다 0이어야 0출력. 그 외에는 1 출력
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println();
		
		// XOR : 두 값이 다르면 1출력. 같으면 0 출력
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println();
		
		// NOR : 1이면 0, 0이면 1 출력
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println();
		
		
	}

}
