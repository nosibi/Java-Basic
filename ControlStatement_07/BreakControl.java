package ControlStatement_07;

public class BreakControl {
	public static void main(String[] args) {
		//break 를 이용한 반복문 탈출
				//break 는 if 문을 제외한 가장 가까운 중괄호 "}"를 탈출
				
				//1. 단일 반복문 탈출
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
					break;
				}
				
				for(int i = 0; i < 10; i++) {
					if(i == 5) {
						break;
					}
					System.out.println(i + " ");
				}
				
				System.out.println("---------------");
				
				//2. 다중 반복문 탈출
				for(int i = 0; i < 5; i++ ) {
					for(int j = 0; j < 5; j++) {
						if(i == 2) {
							break;
						}
						System.out.println(i + "," + j);
					}//가장 가까운 반복문만 탈출
					
				}
				
				System.out.println("---------------");

				
				//3. break + Label 을 이용한 다중 반복문 탈출(Label은 개발자가 임의로 지정 가능)
				POS1:
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(i == 2) {
								break POS1;
							}
							System.out.println(i + "," + j);
						}
					}
				
				System.out.println("---------------");

				//4. 변수값을 조정하여 다중 반복문 탈출
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 5; j++) {
						if(j == 2) {
							i = 10;
							break;
						}
						System.out.println(i + "," + j);
					}
				}
				
				System.out.println("---------------");

	}

}
