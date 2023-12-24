package Interface_05;

/*인터페이스 내부에는 완성된 메서드인 디폴트 메서드가 포함될 수 있다
 *여기서 default는 접근지정자 default와 다르다
 *public default 리턴타입 메서드명(){}
 *인터페이스에 디폴트 메서드를 추가하여도 완성된 메서드이기 때문에 자식클래스는 오버라이딩을 할 의무가 없다
 *하지만, 오버라이딩은 불가능한 것은 아님
 */

interface A{
	void abc();
	public default void bcd() {
		System.out.println("디폴트 메서드 호출");
	}
}

class B implements A{
	public void abc() {
		System.out.println("클래스 B가 인터페이스 A의 abc메서드를 오버라이딩 함");
	}
}

class C implements A{
	public void abc() {
		System.out.println("클래스 C가 인터페이스 A의 abc메서드를 오버라이딩 함");
	}
	public void bcd() {
		System.out.println("클래스 C가 인터페이스 A의 bcd 디폴트 메서드를 오버라이딩 함");
	}
}

public class Interface_5 {
	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();
		
		a1.abc();
		a1.bcd();
		
		a2.abc();
		a2.bcd();
		
	}
}
