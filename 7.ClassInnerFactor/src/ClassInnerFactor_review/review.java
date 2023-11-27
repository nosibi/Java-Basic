package ClassInnerFactor_review;
class A{
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b+c);
		System.out.println(c+d);
		System.out.println(d+a);
	}
}

class B{
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

public class review {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		B b = new B();
		System.out.println(b.n);
	}

}
