package ControlStatement_05;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		//반복 횟수 1회 미만일 경우
		
		// while
		int a = 0;
		while(a < 0) {
			System.out.println("a : " + a);
			a++;
		} //0회 실행
		System.out.println(a);
		
		System.out.println();
		
		// do - while
		int b = 0;
		do {
			System.out.println("b : " + b);
			b++;
		} while(b < 0); //1회 실행
		System.out.println(b);
		
		System.out.println();
		
		//반복 횟수 1회 이상일 경우
		
		// while
		int i = 0;
		while(i < 5) {
			System.out.println("i : " + i);
			i++;
		}
		System.out.println(i);
		
		// do - while
		int j = 0;
		do {
			System.out.println("j : " + j);
			j++;
		} while(j < 5); //1회 실행
		System.out.println(j);
		
	}

}
