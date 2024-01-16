package exceptionThrows_01;

/*예외 발생 시 바로 처리하거나(try-catch) 자신을 호출한 지점으로 예외를 전가(throws)할 수 있다
 *리턴타입 메서드명(입력매개변수) throws 예외 클래스명{}
 */

// 1.하위 메서드에서 직접 예외를 처리하는 경우
class A{
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Thread.sleep(1000); //InterruptedException 발생
		}
		catch(InterruptedException e) {
			System.out.println("InterruptedException occurred");
		}
	}
}

// 2. 예외를 호출 메서드로 전가하는 경우
class B{
	void abc() {
		try {
			bcd();
		}
		catch(InterruptedException e) {
			System.out.println("InterruptedException occurred");
		}
	}
	
	void bcd() throws InterruptedException{
		Thread.sleep(1000);
	}
}

/*만약,예외 처리를 전가한 상위 메서드들도 계속 전가를 한다면 최상위 메서드인 main()메서드까지 올라간다
 *main()메서드는 자바 가상 머신에 예외를 전가하게 된다
 *자바 가상 머신은 직접 예외 처리 시 프로그램을 강제 종료시킨다. 이것이 지금까지 예외처리를 하지 않을 시 JVM에 혼자서 예외를 처리한 방식 
 */

public class ExceptionThrows_1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class cls = Class.forName("java.lang.object2");
	
	}

}
