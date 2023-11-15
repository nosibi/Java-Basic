package Reference_11;

import java.util.Arrays;

public class CharacteristicOfStringClass {
	public static void main(String[] args) {
		// String 클래스의 2가지 특징
		// 1. 객체 안의 값을 변경하면 새로운 객체를 생성
		
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1 = "안녕하세요"; //새로운 객체가 생성됨
		
		System.out.println("str1 :" + str1);
		System.out.println("str2 :" + str2);
		
		System.out.println();
		
		//배열 참조자료형의 경우
		int[] array1 = new int[] {1,2,3};
		int[] array2 = array1;
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8; //실제 데이터값이 변경됨
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		System.out.println();
		
		// 2. 리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유
		
		String a = new String("안녕");
		String b = "안녕";
		String c = "안녕";
		String d = new String("안녕");
		
		// Stack 메모리값 비교
		System.out.println(a == b);
		System.out.println(b == c); //리터럴로 바로 입력한 데이터만 문자열이 같으면 하나의 객체를 공유(=같다)
		System.out.println(c == d);
		System.out.println(d == a);
		
		
	}

}
