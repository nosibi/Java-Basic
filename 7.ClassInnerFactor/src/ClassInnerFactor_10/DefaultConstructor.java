package ClassInnerFactor_10;


//생성자 특징 : 클래스명과 동일한 이름, 리턴 타입이 없음
//기본생성자 자동 추가
//객체 생성 이후 생성자의 중괄호 이후 부분이 실행된다

class A{
	int m;
	void work() {
		System.out.println(m);
	}
	//A(){} 기본생성자는 생략시 자동으로 추가됨
}

class B{
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// 클래스의 객체 생성
		A a = new A();
		B b = new B();
		C c = new C(3);
		
		// 메서드 호출
		a.work();
		b.work();
		c.work();
		
	}

}
/*기본생성자는 생략을 하여도 컴파일러가 자동으로 추가를 한다
 *기본생성자가 아닌 생성자는 자동으로 추가되지 않는다
 *기본생성자 : A(){}
 *기본생성자가 아닌 생성자 : A(int k){} 등등
 */
