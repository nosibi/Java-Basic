package AnonymousInnerClass_02;

interface C{
	void bcd();
}

class A{
	C c = new C() {
		public void bcd() {
			System.out.println("anonymous inner class");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

public class AnonymousInnerClass_2 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
