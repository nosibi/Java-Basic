package Typecasting_01;

//상속관계 만들기
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
	public static void main(String[] args) {
		//Up-Casting(자동변환) : 캐스팅 구문 생략 시 컴파일러가 자동으로 추가
		A ac = (A) new C(); // C -> A
		B bc = (B) new C(); // C -> B
		
		B bb = (B) new B();
		A a = (A) bb; // B -> A
		
		//Down-Casting(수동변환) : 캐스팅 불가 시
		A aa = new A();
		//B b = (B) aa;
		//C c = (C) aa;
		
		//Down-Casting(수동변환) : 캐스팅 가능 시
		A ab = new B();
		B b = (B) ab; // A -> B
		// C c = (C) ab; // A -> C 불가눙(객체가 생성되어 있지 않음. A,B 객체만 생성되어 있음)
		B bd = new D();
		D d = (D) bd; // B -> D
		
		A ad = new D();
		B b1 = (B) ad; // A -> B
		D d1 = (D) ad; // A -> D
		
	}

}
