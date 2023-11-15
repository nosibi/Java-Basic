package Reference_12;

public class PlusOperationOfString {
	public static void main(String[] args) {
		// 문자열 + 문자열
		String str1 = "안녕" + "안녕하세요" + "!";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다";
		str2 += "!";
		System.out.println(str2);
		System.out.println();
		
		// 문자열 + 기본 자료형 or 기본 자료형 + 문자열
		String str3 = "안녕" + 1;
		String str4 = "안녕" + String.valueOf(1); //생략해도 자동 변환
		String str5 = 1 + "안녕";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println();
		
		// 혼용
		System.out.println(1 + 2 + "안녕"); //앞에 있는 기본자료형끼리의 연산 우선 수행
		System.out.println("안녕" + 1 + 2);
		System.out.println(1 + "안녕" + 2);
		
	}
}
