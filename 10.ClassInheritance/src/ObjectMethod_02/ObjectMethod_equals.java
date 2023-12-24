package ObjectMethod_02;

/* Object 클래스의 equals()메서드는 객체의 스택 메모리값을 비교하는 메서드
 * 실제 데이터의 값이 아닌 실제 데이터의 위치를 비교하는 것이다
 * 객체 내부의 값이 동일하여도 실제 객체는 다른 곳에 위치하므로 위칫값을 나타내는 스택 메모리값이 서로 다를 수 있다
 * 실제 내용을 비교하고자 할 경우에는 equals()메서드를 오버라이딩 하여 사용한다
 */

class A{
	String name;
	A(String name){
		this.name = name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	public boolean equals(Object obj) {
		if(this.name == ((B) obj).name)
			return true;
		else
			return false;
	}
}

public class ObjectMethod_equals {
	public static void main(String[] args) {
		A a1 = new A("Hello");
		A a2 = new A("Hello");
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		B b1 = new B("Hello");
		B b2 = new B("Hello");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}

}
/* A클래스와 B클래스의 차이점은 equals()메서드를 오버라이딩 했는지 유무이다
 * 오버라이딩을 하지 않는 A클래스는 생성한 객체가 equals()메서드를 호출하였을 때 Object 클래스의 equals()메서드를 호출하기 때문에 실제 데이터 값이 아닌 스택 메모리값을 비교한다
 * 따라서, equals()메서드나 등가 비교 연산(==)을 하였을 때 false가 출력된 것이다
 * 반대로, B클래스는 equals()메서드를 만들어 오버라이딩 하였기 때문에 true가 출력이 된다
 */
