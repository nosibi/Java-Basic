package ControlStatement_03;

public class ForControlStatement {
	public static void main(String[] args) {
		// for 기본 문법 구조(초기식, 조건식, 증감식)
		
		// 외부 선언
		int a;
		for(a = 0; a < 5; a++) {
			System.out.println("a : " + a);
		}
		System.out.println(a);
		System.out.println();
		
		// 내부 선언
		for(int b = 0; b < 5; b++) {
			System.out.println("b : " + b);
		}
		System.out.println();
		//System.out.println(b); compile error 발생
		
		// 증감식에 대입 연산자 사용
		for(int i = 0; i < 10; i += 2) {
			System.out.println("i : " + i);
		}
		System.out.println();
		
		// 이런 형태도 가능
		for(int i = 0, j = 0; i < 5; i++, j++) {
			System.out.println("i + j : " + (i + j));
		}
		System.out.println();
		
		// 무한루프
		/*for(int i = 0; ; i++) {
			System.out.println(i);
		}*/
		// 조건문이 true로 인식되기 때문에 i의 증감이 무한히 반복됨
		
		
		// 무한루프 탈출
		for(int i = 0; ;i++) {
			if(i > 10) {
				break;
			}
			System.out.println("i : "+ i);
		}
		
	}

}
