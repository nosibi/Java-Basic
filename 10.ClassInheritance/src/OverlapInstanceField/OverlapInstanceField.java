package OverlapInstanceField;

class A{
	int m = 3;
}

class B extends A{
	int m = 4;
}

public class OverlapInstanceField {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		B b = new B();
		A ab = new B();
		
		//인스턴스 필드
		System.out.println(a.m);
		System.out.println(b.m);
		System.out.println(ab.m);
	}

}

/*인스턴스 필드는 이름이 중복되더라도 객체내의 각각의 공간 속에 저장
 * 저장 공간이 완벽하게 분리되어 있으므로 오버라이딩은 발생하지 않는다
 * 따라서, 선업 타입이 즉, 가리키는 객체가 무엇이냐에 따라 호출되는 필드가 결정
 * */
