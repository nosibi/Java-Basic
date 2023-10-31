package ControlStatement_02;

public class SwitchControlStatement {
	public static void main(String[] args) {
		
		//Switch문은 위칫값으로 정수, 문자, 문자열만 가능
		//특정 위치로 이동 후 순서대로 구문 실행
		
		//break 미포함
		int value1 = 2;
		switch(value1) {
		
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B"); // 점프한 후 계속 실행(탈출 x)
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");		
		}
		
		System.out.println();
		
		//break 포함
		int value2 = 2;
		switch(value2) {
		
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break; //실행 후 탈출
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
		
		
		// ex) 10점 만점에 7점 이상은 Pass, 미만은 Fail
		int score = 4;
		switch(score) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Fail");
			break;
		
		
		}
	}

}
