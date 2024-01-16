package userException_02;

/* 점수를 저장하는 score 변수에는 정수 0 ~ 100까지만 대입 가능
 * 이외의 값 대입 시 일반 예외 발생
 * score 값이 음수일 경우를 고려한 MinusException 클래스
 * score 값이 100을 초과할 경우를 고려한 OverException 클래스
 * 정상범위 시 "정상적인 값입니다" 출력. 음수일 경우 "음수입니다". 100초과 시 "100 초과입니다" 출력.
 */

class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String s) {
		super(s);
	}

}

class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String s) {
		super(s);
	}
}

class A{
	void abc(int score) throws MinusException, OverException{
		if(score < 0)
			throw new MinusException("음수입니다");
		else if(score > 100)
			throw new OverException("100 초과입니다");
		else
			System.out.println("정상적인 값입니다");
	}
}

public class UserException_2 {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.abc(120);
		}
		catch(MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
