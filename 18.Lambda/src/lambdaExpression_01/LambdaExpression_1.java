package lambdaExpression_01;
/*자바에서는 메서드를 사용하기 위해서는 클래스 또는 인터페이스 내부에 정의해야 한다. 객체 생성 후 메서드를 호출해야만 사용가능하다
 *람다식을 사용하면 함수형 프로그래밍을 가능하게 할 수 있음 
 *함수형 인터페이스 : 단 하나의 추상 메서드만을 포함하는 인터페이스
 */

interface A{
	void abc();
}

class B implements A{
	//override
	public void abc() {
		System.out.println("method1");
	}
}

public class LambdaExpression_1 {
	public static void main(String[] args) {
		//1.객체 지향 프로그래밍 문법
		A a1 = new B();
		a1.abc();
		
		
		//2.객체 지향 프로그래밍 문법2(익명 이너 클래스 사용)
		A a2 = new A() {
			public void abc() {
				System.out.println("method2");
			}
		};
		a2.abc();
		
		//3.함수형 프로그래밍 문법(람다식)
		A a3 = () -> {System.out.println("method3");};
		a3.abc();
		
		
	}

}