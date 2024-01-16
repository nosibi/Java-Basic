package InnerClass_02;

class A{
	int a = 3;
	static int b = 4;
	void method() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	//정적 이너 클래스
	static class B{
		void abc() {
			//정적 이너 클래스는 정적 메서드와 동일하게 아우터 클래스의 정적 멤버에만 접근 가능
			System.out.println(b);
			method2();
			//System.out.println(a); 접근 불가
			//method(); 접근 불가
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		//객체 생성 : 아우터클래스.정적이너클래스 참조변수 = new 아우터클래스.정적이너클래스();
		A.B b = new A.B();
		b.abc();
	}

}
