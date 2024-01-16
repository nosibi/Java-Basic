package InnerClass_01;

class A{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A class method abc");
	}
	class B{
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//인스턴스 이너 클래스는 아우터 클래스 멤버의 접근지정자와 상관없이 사용가능
			
			abc();
			
		}
	}
}

/*아우터 클래스의 필드, 메서드와 동일한 이름을 이너 클래스 안에서 정의하였을 경우에는 이너 클래스의 필드, 메서드가 참조
 *참조 객체명 생략 시 컴파일러가 this키워드를 자동으로 추가하기 때문
 *만약, 아우터 클래스의 필드나 메서드를 참조하고 싶을 경우 아우터 클래스명.this를 명시 
 */

class C{
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("C class method");
	}
	class D{
		int a = 1;
		int b = 2;
		void abc() {
			System.out.println("D class method");
		}
		void bcd() {
			//이너 클래스의 멤버 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			//아우터 클래스의 멤버 사용
			System.out.println(C.this.a);
			System.out.println(C.this.b);
			C.this.abc();
		}
	}
}

public class InstaceInnerClass {
	public static void main(String[] args) {
		//객체 생성 : 아우터 클래스 객체 생성 후 인스턴스 이너 클래스 객체 생성
		A a = new A();
		A.B b = a.new B(); //아우터클래스명.이너클래스명 참조변수 = 아우터클래스 참조변수명.new 이너클래스명();
		
		b.bcd();
		
		System.out.println();
		
		C c = new C();
		C.D d = c.new D();
		
		d.bcd();
		
	}

}
