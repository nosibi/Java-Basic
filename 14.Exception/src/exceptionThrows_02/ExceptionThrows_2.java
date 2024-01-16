package exceptionThrows_02;

/*다중 예외 전가
 *쉼표로 구분하여 나열
 *리턴타입 메서드명(입력매개변수) throws 예외클래스1, 예외클래스2 ....{}
 */

// 1.하위 메서드에서 직접 예외 처리 시
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); //ClassNotFoundException 발생
			Thread.sleep(1000); //InterruptedException 발생
		}
		catch(ClassNotFoundException | InterruptedException e) {
			// 예외처리 구문
		}
	}
}

// 2. 예외를 호출 메서드에 전가할 경우
class B{
	void abc() {
		try {
			bcd();
		}
		catch(ClassNotFoundException | InterruptedException e) {
			// 예외처리 구문
		}
	}
	void bcd() throws ClassNotFoundException , InterruptedException{
		Class cls = Class.forName("java.lang.Object"); //ClassNotFoundException 발생
		Thread.sleep(1000); //InterruptedException 발생
	}
}

public class ExceptionThrows_2 {
	public static void main(String[] args) {
		System.out.println("다중 예외 전가");
	}
}
