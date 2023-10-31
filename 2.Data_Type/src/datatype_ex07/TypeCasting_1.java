package datatype_ex07;

public class TypeCasting_1 {
	public static void main(String[] args) {
		
		//캐스팅 방법 1: 자료형
		int value1 = (int)5.3;
		long value2 = (long)10;
		float value3 = (float)5.8;
		double value4 = (double)16;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//캐스팅 방법 2: L, F
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		System.out.println("-----------");
		
		//up-casting : 크기(범위)가 작은 자료형을 큰 자료형에 대입, 데이터 손실 발생하지 않음, 자동타입 변환
		float val1 = 3; // int -> float, 업캐스팅
		long val2 = 5; // int -> long, 업캐스팅
		double val3 = 7; // int -> double, 업캐스팅
		byte val4 = 9; // int -> byte, 업캐스팅은 아니지만 자동타입 변환
		short val5 = 11; // int -> short, 업캐스팅은 아니지만 자동타입 변환
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		
		//down-casting : 크기(범위)가 큰 자료형을 작은 자료형에 개발자가 직접 명시적으로 타입 변환, 데이터 손실 발생 가능
		byte val6 = (byte)128; // int -> byte
		int val7 = (int)3.5; // double -> int
		float val8 = (float)7.5; // double -> float
		
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		
	}

}

/*
 1. 자료형의 크기는 byte < short < char < int < long < float < double
 2. byte, short에 저장할 수 있는 정수 값이 대입되면 byte, short로 인식. 그 외에는 기본적으로 int로 인식
 3. 실수 리터럴에서는 double이 기본형
 ex) float a = 3.5; // 오류 발생 -> 3.5가 double로 인식되기 때문에 upcasting 불가능
 ex) byte b = 128; // 오류 발생 -> 128은 byte범위 밖임. int로 인식되므로 오류 발생
 
 
 */
