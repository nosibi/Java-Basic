package referenceOfMethod_02;
/*정의되어 있는 정적 메서드 참조
 *클래스명::정적 메서드명
 */
interface A{
	void abc();
}

class B{
	static void bcd() {
		System.out.println("method");
	} //정적 메서드이므로 접근 지정자를 static으로 지정해야 함
}

public class ReferenceOfMethod_2 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void abc() {
				B.bcd(); //정적 메서드는 클래스명으로 바로 사용 가능하다
			}
		};
		
		A a2 = () -> {B.bcd();};
		
		A a3 = B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}

}
