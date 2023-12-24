package OverlapStaticField;

class A{
	static int m = 3;
}
class B extends A{
	static int m = 4;
}

public class OverlapStaticField {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		
		
		System.out.println();
		
		//객체 생성
		A a = new A();
		B b = new B();
		A ab = new B();
		
		//정적 필드 호출
		System.out.println(a.m);
		System.out.println(b.m);
		System.out.println(ab.m);
	}

}

/*인스턴스 필드와 마찬가지로 정적 필드 또한 저장 공간이 완벽하게 분리된다
*/
