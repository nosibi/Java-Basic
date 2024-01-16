package AnonymousInnerClass_03;

//입력매개변수 객체 전달

interface A{
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C{
	void cde(A a) {
		a.abc();
	}
}



public class AnonymousInnerClass_3 {
	public static void main(String[] args) {
		C c = new C();
		
		//방법1.참조변수로 전달
		A a = new B();
		c.cde(a);
		
		//방법2.클래스명으로 전달
		c.cde(new B());
		
		//방법3.익명 이너클래스 이용하여 전달(참조변수 사용)
		A a1 = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a1);
		
		//방법4. 익명 이너클래스 이용하여 전달(참조변수 x)
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		});
	}

}
