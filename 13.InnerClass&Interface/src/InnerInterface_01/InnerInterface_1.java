package InnerInterface_01;

class A{
	interface B{
		void bcd();
	}
}

class C implements A.B{
	public void bcd() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}

public class InnerInterface_1 {
	public static void main(String[] args) {
		//객채 생성 방법 1 : 자식 클래스 직접 생성		
		C c = new C();
		c.bcd();
		
		//객체 생성 방법 2 : 익명 이너 클래스 생성
		A.B ab2 = new A.B() {
			public void bcd() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
		};
		ab2.bcd();
		
		
		
	}

}
