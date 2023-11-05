package ControlStatement_08;

public class ContinueControl {
	public static void main(String[] args) {
		//1. 단일 반복문에서 continue 사용
		for(int i = 0; i < 10; i++) {
			continue;
			//System.out.println(i + " "); //unreachable code
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " ");
			continue;
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i + " ");
		} //5만 출력되지 않음
		
		System.out.println("----------------------------");
		
		//2. 다중 반복문에서 continue 사용
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue;
				}
				System.out.println(i + "," + j);
			}
		}
		
		System.out.println("----------------------------");

		
		//continue - Label 활용
		POS1:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(j == 3) {
						continue POS1;
					}
					System.out.println(i + "," + j);
				}
			}
	}

}
