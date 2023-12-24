package OverlapStaticMethod;

class A{
	static void print() {
		System.out.println("A class");
	}
}

class B extends A{
	static void print() {
		System.out.println("B class");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		A.print();
		B.print();
		
		System.out.println();
		
		//객체 생성
		A a = new A();
		B b = new B();
		A ab = new B();
		
		//정적 메서드 호출
		a.print();
		b.print();
		ab.print();
	}

}

/*오버라이딩은 인스턴스 메서드에서 발생하며 그 조건은 부모클래스의 메서드와 시그니처 및 리턴 타입이 동일할 경우이다
 *하지만, 그 외 인스턴스 필드, 정적 필드, 정적 메서드는 저장 공간이 완벽히 분리되기 때문에 오버라이딩이 발생하지 않는다
 *값을 읽을 때의 기준은 오버라이딩이 발생하는 인스턴스 메서드의 경우 생성자가 무엇이냐가 그 기준이 된다
 *반대로 인스턴스 필드, 정적 필드, 정적 메서드에서는 선언 타입 즉, 가리키는 객체가 무엇이냐가 값을 읽을 때의 기준이 된다 
 */
