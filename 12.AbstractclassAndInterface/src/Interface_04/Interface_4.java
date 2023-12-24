package Interface_04;

/*인터페이스도 추상메서드를 포함하기 때문에 추상클래스와 마찬가지로 직접 객체 생성이 불가능하다
 *자식클래스 생성 후 오버라이딩 또는 익명 이너 클래스 생성하여 객체를 생성할 수 있다
 */
interface A{
	int a = 3;
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("자식클래스를 이용한 인터페이스 객체 생성");
	}
}


public class Interface_4 {
	public static void main(String[] args) {
		//방법1
		A a1 = new B();
		a1.abc();
		
		
		//방법2
		A a2 = new A() {
			public void abc() {
				System.out.println("익명 이너 클래스를 이용한 인터페이스 객체 생성");
			}
		};
		a2.abc();
	}

}
