package ClassInnerFactor_12;
//클래스 내부에서 필드, 메서드 앞에는 자동으로 this라는 참조변수가 붙는다
//생략 시 자동으로 컴파일러가 이를 추가하지만 명시적으로 붙여야 하는 경우가 있다
//예를 들어 필드와 메서드의 지역변수가 동일한 이름을 가질 경우가 있다

class A{
	int m;
	int n;
	void init(int m, int n) {
		m = m; //둘 다 init메서드의 지역변수로 인식되므로 필드 m은 초기화 되지 않는다
		n = n;
	}
}

class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m; //좌측 this.m이 필드 m을 가리키므로 초기화가 이루어진다
		this.n = n;
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		//클래스 객체 생성
		A a = new A();
		B b = new B();
		
		a.init(1,2);
		b.init(1,2);
		
		System.out.println(a.m); //초기화되지 않았기 때문에 출력시 0이 나온다
		System.out.println(a.n);
		
		System.out.println(b.m); //초기화되었기 때문에 대입한 값이 출력이 된다
		System.out.println(b.n);
	}
	

}
