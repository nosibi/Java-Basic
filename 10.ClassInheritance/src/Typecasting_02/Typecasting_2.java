package Typecasting_02;

class A{
	int m = 3;
	void abc() {
		System.out.println("A class");
	}
}

class B extends A{
	int n = 4;
	void bcd() {
		System.out.println("B class");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		// A타입, A생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		// B타입, B생성자
		B bb = new B();
		System.out.println(bb.n);
		bb.bcd();
		
		// A타입, B생성자
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
		 //System.out.println(ab.n);
		 //ab.bcd(); // A타입으로 선언되어 A객체를 가리키고 있기 때문에 B의 멤버는 사용할 수 없다
		
	}

}

/*생성자로 인해 객체가 생성되어 참조변수가 가리키는 객체, 즉 선언된 타입이 무엇이냐에 따라 사용할 수 있는 클래스에 멤버가 달라진다
 *다운캐스팅 시에는 생성자가 무엇인지가 기준점이었다면, 인스턴스 멤버 사용시에는 선언된 타입이 기준점이 된다
 */

