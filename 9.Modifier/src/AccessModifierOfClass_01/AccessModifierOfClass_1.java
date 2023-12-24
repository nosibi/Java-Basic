package AccessModifierOfClass_01;

//같은 패키지에서 클래스의 접근 지정자와 생성자의 접근 지정자
//동일 패키지 내부에 있으므로 import 할 필요가 없다

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		B b = new B();
		C c = new C();
		
		/* 같은 패키지에서는 public, default 클래스 모두 객체를 선언할 수 있다
		 * 마찬가지로, 같은 패키지에서는 public, default 생성자 모두 호출 가능하다
		 * 따라서 A,B,C 모두 객체 생성이 가능
		 */
	}

}
