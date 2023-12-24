package MethodOverriding_02;

class ABC{
	void abc() {
		System.out.println("ABC");
	}
}
class A extends ABC{
	void abc() {
		System.out.println("A");
	}
}
class B extends ABC{
	void abc() {
		System.out.println("B");
	}
}
class C extends ABC{
	void abc() {
		System.out.println("C");
	}
}

public class MethodOverriding_2 {
	public static void main(String[] args) {
		ABC aa = new A();
		ABC ab = new B();
		ABC ac = new C();
		
		ABC[] az = {aa,ab,ac};
		for(ABC k : az) {
			k.abc();
		}
		
		
	}

}
