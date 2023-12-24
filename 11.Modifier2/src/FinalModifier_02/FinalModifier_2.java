package FinalModifier_02;

/*final method : 메서드 오버라이딩 불가
 *final class : 상속 불가
 */

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
	//void bcd() {} //메서드 오버라이딩 불가
}

final class C{}

//class D extends C{} //클래스 상속 불가

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}

}
