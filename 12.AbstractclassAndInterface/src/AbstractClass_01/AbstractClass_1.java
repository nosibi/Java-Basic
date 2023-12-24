package AbstractClass_01;

abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("자식 클래스 생성 후 추상 메서드 구현");
	}
}

public class AbstractClass_1 {
	public static void main(String[] args) {
		A a = new B();
		
		a.abc();
	}

}
/*추상클래스는 객체를 직접 생성할 수 없다
*따라서, 자식클래스를 생성하여 추상메서드를 오버라이딩 해야한다
*1개 이상의 추상메서드를 가진 클래스는 추상클래스로 정의해야 한다
*/
