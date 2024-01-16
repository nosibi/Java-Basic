package tryCatchFinally;

/*예외란 개발자가 해결가능한 오류
 *예외에는 일반예외, 실행예외가 있음. 일반예외는 예외 처리를 하지 않으면 문법 오류 발생, 실행예외는 문법 오류는 발생하지 않으나 실행 중 실행예외가 발생하면 프로그램 강제 종료
 *일반예외 - InterruptedException, ClassNotFoundException, IOException, FileNotFoundException, CloneNotSupportedException
 *실행예외 - ArithmeticException, ClassCastException, ArrayIndexOutOfBoundsException, NumberFormatException
 */

public class TryCatchFinally {
	public static void main(String[] args) {
		// 1. try - catch
		try {
			System.out.println(3 / 0); //실행예외 발생. ArithmeticException
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occurred");
		}
		
		// 2. try - catch - finally
		try {
			System.out.println(3 / 0);
		}
		
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없음");
		}
		
		finally {
			System.out.println("finally는 항상 실행"); //try, catch 에 중복되는 코드는 finally{}블록에 입력하면 중복 제거 가능
		}
		
	}

}
