package ControlStatement_ex;

public class ControlStatement_ex {
	public static void main(String[] args) {
		//1.
		int score = 72;
		if(score >= 80 && score < 90) {
			System.out.println("B학점");
		}
		else if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		
		System.out.println("--------------------------");

		
		//2.
		
		System.out.println("--------------------------");

		
		//3.
		for(int i = 0; ; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
			
			if(i == 10) {
				break;
			}
		}
		
		System.out.println("--------------------------");
		
		//4.
		int k = 10;
		while(k > 0) {
			System.out.println(k);
			k -= 2;
		}
		
		System.out.println("--------------------------");

		
		//5.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A");
			}
		}
		
		//6.
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
			}
			if(i == 3) {
				break;
			}
		}
		
		//7.
		OUT:
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 5; j++) {
					if(i == 3 && j ==2) {
						break OUT;
					}
				}
			}
	}

}
