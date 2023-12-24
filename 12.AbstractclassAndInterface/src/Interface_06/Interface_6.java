package Interface_06;

/*class와는 다르게 interface는 다중상속이 가능하기 때문에 super키워드 사용 시 부모인터페이스명.super.부모메서드명() 으로 명시해야 한다
 *예를 들어, class D extends C implements A,B의 경우 D클래스의 부모는 셋이다
 *super.부모메서드명()은 당연히 다중상속이 불가한 클래스를 호출한 것임을 알 수 있다
 *하지만, 인터페이스는 다중상속이 가능하여 앞에 인터페이스명을 추가하지 않으면 어느 것을 호출할 지 알 수 없다
 */

interface A{
	default void abc() {
		System.out.println("A interface abc");
	}
}

class B implements A{
	public void abc() {
		A.super.abc();
		System.out.println("B class abc");
	}
}

public class Interface_6 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}

}