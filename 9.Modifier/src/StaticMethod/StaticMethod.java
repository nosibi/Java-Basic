package StaticMethod;

class A{
	void a() {
		System.out.println("instance method");
	}
	static void b() {
		System.out.println("static method");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		//instance method 활용(객체 생성 후 활용 가능)
		A a1 = new A();
		a1.a();
		
		//static method 활용
		//1. 클래스명으로 바로 접근
		A.b();
		
		//2. 객체 생성 후 사용(권장하지 않음)
		A a2 = new A();
		a2.b();
	}

}
