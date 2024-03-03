package referenceOfMethod_01;
/*람다식 활용에는 메서드 구현과 메서드 참조
 *메서드 참조에는 인스턴스 메서드 참조, 정적 메서드 참조
 *인스턴스 메서드는 사용하려면 객체 생성 필요, 정적 메서드는 사용하려면 클래스명만 필요
 *정의되어 있는 인스턴스 메서드 참조하는 법
 *클래스 객채::인스턴스 메서드명
 */
interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("method");
	}
}

interface C{
	void cde(int k);
}

public class ReferenceOfMethod_1 {
	public static void main(String[] args) {
		//1.익명 이너 클래스
		A a1 = new A() {
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		//2.람다식
		A a2 = () -> {
			B b = new B();
			b.bcd();
		}; //불필요한 방법임
		
		//3.정의된 인스턴스 메서드 참조
		B b = new B();
		A a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
		//동일한 결과가 출력되므로 3번째 방법이 가장 효율적
		
		System.out.println();
		
		//이를 활용하면 다음과 같이 활용가능
		C c1 = new C() {
			public void cde(int k) {
				System.out.println(k);
			}
		};
		
		C c2 = (int k) -> {System.out.println(k);};
		
		C c3 = System.out::println;
		
		c1.cde(3);
		c2.cde(3);
		c3.cde(3);
		
	}
	
}
