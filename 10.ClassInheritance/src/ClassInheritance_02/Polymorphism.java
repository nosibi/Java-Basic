package ClassInheritance_02;

// 상속을 이용한 객체의 다형적 표현

// 상속관계 만들기
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		// A타입의 다형적 표현
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		// B타입의 다형적 표현
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		
		// C타입의 다형적 표현
		C c1 = new C();
		
		// D타입의 다형적 표현
		D d1 = new D();
	
	}

}
