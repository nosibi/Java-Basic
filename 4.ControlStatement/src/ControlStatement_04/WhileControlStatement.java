package ControlStatement_04;

public class WhileControlStatement {
	public static void main(String[] args) {
		//while 문법 구조
		int a = 0; //초기식
		while(a < 4) {       //조건식
			System.out.println("a : " + a);
			a++; //증감식
		}
		System.out.println();
		// 초기식을 중괄호 안에서 선언할 수는 있지만 반복할 때마다 초기화되어 무한 루프가 발생한다
		
		//for 문으로 표현 가능
		for(int b = 0; b < 4; b++) {
			System.out.println("b : " + b);
		}
		System.out.println();
		
		//무한 루프
		/*while(true) {
			System.out.println("Eternal loop");
		}*/
		
		
		//무한 루프 탈출
		int c = 0;
		while(true) {
			if(c > 5) {
				break;
			}
			System.out.println(c + "회 반복");
			c++; // 증감식을 안할 경우 무한루프가 발생한다
		}
		
		
		
		
	}

}
