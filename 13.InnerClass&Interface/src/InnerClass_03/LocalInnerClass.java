package InnerClass_03;

class A{
	int a = 3;
	void abc() {
		int b = 5;
		//지역 이너 클래스
		class B{
			void bcd() {
				System.out.println(a); //필드 호출
				System.out.println(b); //지역변수 호출
				a = 7;
				//b = 8; 지역변수 사용 시 해당 지역 변수가 자동으로 final로 선언되기 때문에 값의 변경이 불가능
			}
		}
		
		B bb = new B(); //객체 생성은 지역 이너 클래스가 정의된 메서드 내부에서만 가능
		bb.bcd();
	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
