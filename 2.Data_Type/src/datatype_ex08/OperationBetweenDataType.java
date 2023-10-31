package datatype_ex08;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		// 모든 연산은 같은 자료형끼리만 가능
		// int보다 같거나 작은 자료형끼리 연산은 int
		// int보다 큰 자료형끼리 연산은 해당 자료형
		
		//같은 자료형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5; // 1이 출력
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byte value5 = data1 + data2; // 오류 발생
		int value5 = data1 + data2; // byte + byte 연산 결과는 int 자료형이기 때문
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		System.out.println("----------------");
		
		//다른 자료형 간의 연산
		//int value6 = 5 + 3.5; // 오류 발생 -> 8.5는 double형이기 때문
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		double value8 = 5 / 2.0;
		
		byte data3 = 3;
		byte data4 = 5;
		
		int value9 = data3 + data4;
		double value10 = data3 + data4; // int -> double로 up-casting 발생
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
		System.out.println("------------");
		System.out.println((int)5.6 + 3.5);
		System.out.println((int)5.6 + (int)3.5);
		System.out.println((int)(5.6+3.5));
		System.out.println(7 / 4); // int, int 계산이므로 int형인 1이 출력
		System.out.println((double)3 / 2); // double, int 계산이므로 double형 
		System.out.println((double)(3 / 2)); //int형끼리 계산 후 double로 변환
	}

}
