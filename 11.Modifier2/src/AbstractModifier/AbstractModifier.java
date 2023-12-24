package AbstractModifier;

/*기능이 정의되지 않은 미완성의 메서드를 추상메서드라고 한다
 *추상메서드는 중괄호 없이 소괄호 이후 세미클론 처리한다
 *추상메서드 1개 이상 포함하고 있는 클래스는 반드시 추상클래스로 정의해야 한다
 *추상클래스를 상속받은 클래스는 추상메서드를 가진다
 *하지만 일반메서드는 추상클래스로 정의되어 있지 않고 만약 메서드 오버라이딩이 되어 있지 않다면 문법적 오류가 발생한다
 */

abstract class ABC{
	abstract void abc();
}

class A extends ABC{
	void abc() {
		System.out.println("A");
	}
}

class B extends ABC{
	void abc() {
		System.out.println("B");
	}
}

public class AbstractModifier {
	public static void main(String[] args) {
		ABC abc1 = new A();
		ABC abc2 = new B();
		
		abc1.abc();
		abc2.abc();
		
	}
}
