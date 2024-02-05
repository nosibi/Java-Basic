package restrictionOfGenericType_02;

/*제네릭 메서드에서 제네릭 타입 범위 제한
 */
class A{
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

class B{
	public int method2() {
		return 3;
	}
}

class C{
	public <T extends B> void method3(T t) {
		int c = t.method2();
		System.out.println(c);
	}
}


public class RestrictionOfGenericType_2 {
	public static void main(String[] args) {
		A a = new A();
		a.method1(10.4);
		
		C c = new C();
		c.method3(new B()); //B객체를 넘겨야 입력매개변수에 B객체가 들어가 method2를 호출 가능
	}
}
