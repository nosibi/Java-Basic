package referenceOfConstructor_02;

/*클래스의 생성자가 여려 개일 경우 클래스 참조 시 어떤 생성자가 호출되는가
 *인터페이스의 추상 메서드의 매개변수에 따라 결정된다
 */
interface A{
	C abc();
}

interface B{
	C bcd(int k);
}

class C{
	C(){
		System.out.println("추상 메서드의 매개변수가 없을 경우 호출되는 생성자");
	}
	
	C(int k){
		System.out.println("추상 메서드의 매개변수가 있을 경우 호출되는 생성자");
	}
}

public class ReferenceOfConstructor_2 {
	public static void main(String[] args) {
		//1.익명 이너 클래스
		A a1 = new A() {
			public C abc() {
				return new C();
			}
		};
		
		B b1 = new B() {
			public C bcd(int k) {
				return new C(k);
			}
		};
		
		//2.람다식
		A a2 = () -> {return new C();};
		B b2 = (int k) -> {return new C(k);};
		
		//3.클래스 생성자 참조
		A a3 = C::new;
		B b3 = C::new;
		
		a1.abc();
		b1.bcd(3);
		
		System.out.println();
		
		a2.abc();
		b2.bcd(3);
		
		System.out.println();
		
		a3.abc();
		b3.bcd(3);
		
	}

}
