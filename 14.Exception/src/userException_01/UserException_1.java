package userException_01;

/*사용자 정의 예외 클래스
 *사용자 정의 예외 클래스 작성 -> 객체 생성 -> 예외 던지기(throw)
 *예외 던지기에 사용되는 throw는 예외 전가의 throws와 다르다
 *실행 예외일 경우 RuntimeException 클래스를 상속한다
 */


// 1. 사용자 정의 예외 클래스 작성(일반 예외)
class MyException extends Exception{
	public MyException() {
		super();
	}//기본 생성자
	
	public MyException(String message) {
		super(message);
	} //두번째 생성자 : 예외 메시지를 전달받아 예외 객체를 생성하는 생성자
}

class A{
	// 2. 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지");
			
	// 3. 예외 던지기
			
		// 3-1. 직접 처리
			void abc(int num) {
				try {
					if(num > 70)
						System.out.println("정상 작동");
					else
						throw me1;
				}
				catch(MyException e) {
					System.out.println("예외 처리");
				}
			}
			void bcd() {
				abc(45);
			}
			
		// 3-2. 예외 전가
			void abc_2(int num) throws MyException{
				if(num > 70)
					System.out.println("정상 작동2");
				else
					throw me1;
			}
			void bcd_2() {
				try {
					abc_2(45);
				}
				catch(MyException e) {
					System.out.println("예외 처리2");
				}
			}
}


public class UserException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.bcd();
		a.bcd_2();
		
	}

}
