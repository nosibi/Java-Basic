package datatype_ex02;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		/*
		 필수사항 : 지키지 않으면 문법 오류가 발생하여 컴파일 불가
		 권장사항 : 문법 오류가 발생하지는 않지만 지키지 않으면 가독성이 떨어지므로 현업에서 준수
		 */
		
		//변수
		boolean aBcD; // 대문자는 새로운 단어의 앞 글자에 사용 권장
		byte 가나다;  // 한글로 작성 가능(권장하지는 않음)
		char $ab_cd; 
		//int 3abcl  // 숫자는 이름 맨 앞에 올 수 없음
		long abcd3;
		//float int // 자바 예약어는 이름으로 사용 불가
		double main;
		//int my work // $, _ 제외 특수문자 사용 불가
		String myClassName;
		int ABC; // 전부 대문자로 작성(권장하지는 않음)
		
		
		
		//상수
		final double PI;
		final int MY_DATA;
		final float myData; // 소문자로 작성(권장하지는 않음)
	}

}

/*
필수사항
1. 영문 대소 문자와 한글 사용 가능
2. 특수문자는 밑줄(_)과 달러($) 표시만 사용 가능
3. 아라비아 숫자를 사용할 수 있다. 단, 첫 번째 글자로는 사용 불가
4. 자바에서 사용하는 예약어 사용 불가 ex) int, break, public 등

권장사항
<변수명 지을 시>
1. 영문 소문자로 시작
2. 영문 단어를 2개 이상 결합시 새로운 단어의 첫 글자를 대문자로 시작 ex)myWork, bestPosition

<상수명 지을 시>
1. 변수와 구분하기 위해 모두 대문자로 표기
2. 단, 여러 개 결합 시 밑줄(_)을 표기 ex) MY_CONSTANT
*/
