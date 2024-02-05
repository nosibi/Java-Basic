package genericMethod_02;

/*제너릭 메서드는 정의하는 시점이 아닌 호출하는 시점에서 타입이 결정됨
 *나중에 어떤 타입이 제네릭 타입 변수로 확정되더라도 항상 사용할 수 있는 메서드만 제네릭 메서드 내부에서 사용 가능
 *모든 자바클래스가 Object 클래스를 상속하기 때문에 제네릭 메서드 내에서 Object 의 메서드만 사용 가능
 *이러한 단점을 극복할 수 있는 방법이 "제네릭 타입의 범위 제한"
 */
class A{
	public <T> void set(T t) {
		System.out.println(t.equals("Hello")); // Object 메서드이기 때문에 사용가능(항상 사용할 수 있는 메서드)
		//System.out.println(t.length()); // String 메서드이기 때문에 사용불가
	}
}

public class GenericMethod_2 {
	public static void main(String[] args) {
		A a = new A();
		a.set("Hi");
	}

}
