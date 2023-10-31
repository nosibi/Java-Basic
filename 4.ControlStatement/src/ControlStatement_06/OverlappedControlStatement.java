package ControlStatement_06;

public class OverlappedControlStatement {
	public static void main(String[] args) {
		// if - if 중복
		int value1 = 6;
		int value2 = 3;
		if(value1 > 5) {
			if(value2 < 3) {
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}
		else {
			System.out.println("실행3");
		}
		System.out.println();
		
		
		// switch - for 중복
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k = 0; k < 10; k++) {
				System.out.println("k : " + k);
			}
			break;
		
		case 2:
			for(int k = 10; k > 0; k--) {
				System.out.println("k : " + k);
			}
			break;
		
		}
		System.out.println();
		
	}

}
