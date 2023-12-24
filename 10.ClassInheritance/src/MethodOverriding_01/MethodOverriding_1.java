package MethodOverriding_01;

class A{
	void print() {
		System.out.println("A class");
	}
}

class B extends A{
	void print() {
		System.out.println("B class");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] args) {
		// A타입 A생성자
		A a = new A();
		a.print();
		
		// B타입 B생성자
		B b = new B();
		b.print();
		
		// A타입 B생성자
		A ab = new B();
		ab.print();
	}

}

/*메서드 오버라이딩은 다음 두 조건을 만족하여야 한다
 *1.부모클래스의 메서드와 시그니처 및 리턴 타입이 동일
 *2.부모클래스의 메서드보다 접근지정자의 범위가 동일하거나 넓어야 함 
 *참조변수가 가리키는 객체에 상관없이 생성자를 기준으로 메서드 오버라이딩이 이루어짐 
 */
