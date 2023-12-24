package AbstractClass_02;
/*객체를 직접 생성할 수 없는 추상클래스가 객체를 생성하는 방법은 2가지
 *1.자식클래스를 생성하여 메서드를 오버라이딩 한다
 *2.익명 이너 클래스를 생성한다
 */

abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("1번째 방법 : 자식클래스 생성 후 메서드 오버라이딩");
	}
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		A a1 = new B();
		a1.abc();
		
		
		A a2 = new A() {
			void abc() {
				System.out.println("2번째 방법 : 익명 이너 클래스 생성");
			}
		};
		a2.abc();
	}

}
/*객체를 여러개 생성해야 할 시에는 자식클래스를 생성하여 메서드 오버라이딩 하는 것이 적절
 *객체를 1개만 생성해야 할 경우 익명 이너클래스를 이용하는 것이 적절
 */