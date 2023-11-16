package Reference_14;

import java.util.Arrays;

public class MethodOfString_2 {
	public static void main(String[] args) {
		//1.문자열 수정
		// toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //문자열을 소문자로 변환
		System.out.println(str1.toUpperCase()); //문자열을 대문자로 변환
		
		System.out.println();
		
		// replace(a,b) : 문자열 a를 문자열 b로 교체
		System.out.println(str1.replace("Study", "공부"));
		
		System.out.println();
		
		// subString()
		System.out.println(str1.substring(0,5)); //문자열의 0에서 5-1번째 index까지를 포함하는 새로운 문자열 객체 생성
		
		System.out.println();
		
		// split() : 괄호 안의 특정 기호를 기준으로 문자열 분리
		String[] strArray = "abc/def-ghi jkl".split("/|-| "); // / 또는 - 또는 공백으로 구분된 문자열 반환. 여러 기호로 구분할 시 | 를 사용한다
		System.out.println(Arrays.toString(strArray));
		
		System.out.println();
		
		// trim() : 문자열의 좌우 공백 제거
		System.out.println("     abc     ".trim());
		
		System.out.println();
		
		
		//2.문자열의 내용 비교
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java"); // new로 생성했기 때문에 별도의 객체임
		
		// stack 메모리 비교(==) : 위치(번지) 비교
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		System.out.println();
		
		// equals() : 위치값이 아닌 실제 데이터값 비교(대소문자는 구분)
		// equalsIgnoreCase() : eqauls()와 동일(대소문자 구분하지 않음)
		System.out.println(str2.equals(str3)); // new로 생성했기에 위치값은 다르지만 실제 데이터값은 같다
		System.out.println(str3.equals(str4)); // 대소문자가 구분되므로 다르다
		System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자 구분하지 않으므로 같은 값으로 판단됨
		
		System.out.println("-------------------------------------------");
		
		
		/*정리
		 * str.toUpperCase() : 문자열을 대문자로 변환
		 * str.toLowerCase() : 문자열을 소문자로 변환
		 * str.replace("Abc","Def") : 문자열 Abc를 Def로 변환
		 * str.subString(n,m) : str의 n번째부터 m-1번째 index를 포함하는 새로운 문자열 객체 생성
		 * str.split("a") : a를 기준으로 구분된 문자열을 분리(공백도 기준으로 가능)
		 * str.trim() : 문자열의 좌우 공백 제거
		 * str.equals(str2) : str과 str2의 위치값이 아닌 실제 데이터값(내용)이 같은지 비교(대소문자는 구분)
		 * str.equalsIgnoreCase(str2) : equals와 기능은 같으나 대소문자는 구분하지 않음
		 */
		
		// 의문점 : split 사용시 왜 String 객체가 아닌 String 배열에 저장하는가
		// String은 참조 자료형이지만 배열은 아니다. 배열 또한 참조 자료형이지만 String이 아니다. String[]은 참조 자료형 배열임.
		// ex)
		String a = "Hello World";
		// String[] b = "Hello World"; //불가능
		String[] b = new String[] {"Hello","World"};
		System.out.println(a);
		System.out.println(b); //참조 변수이기 때문에 stack 메모리에 있는 b가 가리키는 위치값이 출력이된다
		//따라서 실제 데이터 값을 출력하고 싶을 경우
		System.out.println(Arrays.toString(b));
		
		// 다시 본론으로 돌아와서 split으로 분리하면 배열에 포함되어야 하기 때문에 String[]을 사용한다
		String[] c = a.split(" ");
		System.out.println(Arrays.toString(c));
		
		
		
	
	}

}
