package Reference_13;

import java.util.Arrays;

public class MethodOfString_1 {
	public static void main(String[] args) {
		//1. 문자열 길이
		String str1 = "Hello Java";
		String str2 = "안녕하세요!반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		//2. 문자열 검색
		//charAt()
		System.out.println(str1.charAt(1)); //1번째 인덱스
		System.out.println(str2.charAt(1)); //1번째 인덱스
		System.out.println();
		
		// indexOf() : 문자열에 포함된 문자(열)의 위치를 앞에서부터 검색했을 시 일치하는 인덱스 값
		// lastIndexOf() : 문자열에 포함된 문자(열)의 위치를 뒤에서부터 검색했을 시 일치하는 인덱스 값
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('a',8)); //8번째 인덱스부터 시작하여 'a'라는 문자의 위치 인덱스 값
		
		System.out.println();
		
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf('a',8));
		
		System.out.println();
		
		System.out.println(str1.indexOf("Java")); //문자열을 검색, 큰 따옴표로 입력
		System.out.println(str1.lastIndexOf("Java"));
		
		System.out.println();
		
		System.out.println(str1.indexOf("Bye")); //해당 문자(열)이 없는 경우 -1 리턴
		
		System.out.println();
		
		//3. 문자열 변환 및 연결
		
		//String.valueOf(기본자료형) : 기본자료형 -> 문자열
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//concat() : 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3)); //출력값은 같다
		
		System.out.println(str6);
		System.out.println(str7);
		
		System.out.println();
		
		// 문자열 -> byte[] (getBytes()) or char[] (toCharArray())
		String str8 = "Hello Java";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4)); //Python에 split 함수와 유사
		
		System.out.println();
		
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ",");
		} // for 문을 이용하여 출력 가능
	}

}
