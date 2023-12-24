package MethodOverriding_03;

//메서드 오버라이딩, 메서드 오버로딩
//메서드 오버라이딩 : 부모클래스의 메서드와 시그니처 및 리턴타입이 동일
//메서드 오버로딩 : 동일한 메서드명이지만 입력매개변수의 자료형이나 개수가 다름

class A{
	void print1() {
		System.out.println("A class print1");
	}
	void print2() {
		System.out.println("A class print2");
	}
}

class B extends A{
	void print1() {
		System.out.println("B class print1");
	}
	void print2(int m) {
		System.out.println("B class print2");
	}
}

public class MethodOverriding_3 {
	public static void main(String[] args) {
		// A타입, A생성자
		A a = new A();
		a.print1();
		a.print2();
		
		System.out.println();
		
		// B타입, B생성자
		B b = new B();
		b.print1();
		b.print2();
		b.print2(3);
		
		System.out.println();
		
		// A타입, B생성자
		A ab = new B();
		ab.print1();
		ab.print2();
		 //ab.print2(3); 불가능(객체가 A를 가리키고 있기 때문)
	}

}
