package AnonymousInnerClass_01;

interface C{
	void bcd();
}

class A{
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C{
		public void bcd() {
			System.out.println("instance inner class");
		}
	}
}


public class AnonymousInnerClass_1 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
