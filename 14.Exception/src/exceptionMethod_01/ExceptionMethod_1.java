package exceptionMethod_01;

/*Exception의 메서드 getMessage()
 *예외 발생 시 생성자로 넘긴 메시지를 문자열 형태로 리턴하는 메서드
 *public String getMessage() 
 */

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		// 1. 예외 객체 생성 시 메시지 전달하지 않을 경우 : Null값을 리턴
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 2. 예외 객체 생성 시 메시지 전달하는 경우 : 객체 생성 시 넘겨준 문자열을 리턴
		try {
			throw new Exception("예외 처리");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
