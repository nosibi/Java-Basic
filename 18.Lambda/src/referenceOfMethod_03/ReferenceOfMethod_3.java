package referenceOfMethod_03;
/*클래스명::인스턴스 메서드명
 *첫 번째 매개변수로 객체가 주어질 경우
 */

interface A{
	void abc(B b, int k);
}

class B{
	void bcd(int k) {
		System.out.println(k);
	}
}

interface C{
	int cde(String str);
}

public class ReferenceOfMethod_3 {
	public static void main(String[] args) {
				//직접 정의한 인스턴스 메서드 참조
		
				//1.익명 이너 클래스
				A a1 = new A() {
					//override
					public void abc(B b, int k) {
						b.bcd(k); //객체가 첫번째 매개변수로 전달되므로 생성 과정은 따로 필요 없음
					}
				};
				
				//2.람다식
				A a2 = (B b, int k) -> {b.bcd(k);};
				
				//3.직접 정의한 인스턴스 메서드 참조
				A a3 = B::bcd;
				
				a1.abc(new B(), 3);
				a2.abc(new B(), 3);
				a3.abc(new B(), 3);
				
				System.out.println();
				
				//자바가 제공하는 인스턴스 메서드 참조
				
				//1.익명 이너 클래스
				C c1 = new C() {
					public int cde(String str) {
						return str.length();
					}
				};
				
				//2.람다식
				C c2 = (String str) -> {return str.length();};
				
				//3.자바가 제공하는 인스턴스 메서드 참조
				C c3 = String::length;
				
				System.out.println(c1.cde("Hello"));
				System.out.println(c2.cde("Hello"));
				System.out.println(c3.cde("Hello"));
		
		
	}

}
