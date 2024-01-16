package multiCatch;

/*catch(){} 블록은 예외 타입에 따라 여러 개를 포함할 수 있다
 *각각의 예외처리를 위해 각 구문마다 별도의 예외 처리 구문을 작성하는 것은 비효율적
 *각각의 catch(){}블록을 하나의 예외처리 구문으로 묶을 수 있다 
 */

public class MultiCatch {
	public static void main(String[] args) {
		// 1. 단일 try - catch
		try {
			System.out.println(3 / 0);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occurred");
		}
		finally {
			System.out.println("exit");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred");
		}
		finally {
			System.out.println("exit");
			
		}
		
		System.out.println();
		
		// 2. 다중 try - catch
		try {
			System.out.println(3 / 0);
			int a = Integer.parseInt("10A");
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occurred");
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred");
		}
		
		finally {
			System.out.println("exit");
		}
		
		
		System.out.println();
		
		// catch 블록의 순서
		
		/* 잘못된 순서
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e) {
			System.out.println("모든 예외는 exception의 하위 클래스");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred");
		}
		finally {
			System.out.println("exit");
		}
		*/
		
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred");
		}
		
		catch(Exception e) {
			System.out.println("모든 예외는 exception의 하위 클래스");
		}
		
		finally {
			System.out.println("exit");
		}
	}

}
/*catch 블록의 선택 과정은 항상 위에서부터 확인된다(if- else if- else 에서 조건식을 위해서부터 검사하는 것과 같음)
 *
 */ 
