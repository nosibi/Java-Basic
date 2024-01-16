package multiCatch_02;

/*예외의 OR(|)연산으로 구성한 다중 catch 구문
 *catch(예외타입 A | 예외타입 B 참조변수명){}
 */

public class MultiCatch_2 {
	public static void main(String[] args) {
		// 1. catch 블록 각각 처리 시
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occurred");
		}
		catch(NumberFormatException e) {
			System.out.println("Exception occurred");
		}
		
		
		System.out.println();
		
		// 2. OR 연산으로 처리 시
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("Exception occurred");
		}
	}

}
