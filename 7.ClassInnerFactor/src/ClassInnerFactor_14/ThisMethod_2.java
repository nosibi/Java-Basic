package ClassInnerFactor_14;

//만약, 여러 개의 필드 값을 초기화하는 코드를 포함하는 생성자를 만들어야 하는 경우
//필드가 20개이면 20개 초기화하기 위해 20줄의 초기화코드를 작성하는 것은 비효율적이다
//그 경우에는 this()메서드를 이용하여 다른 생성자를 호출하면 된다

class A{
	int m1,m2,m3,m4;
	A(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a,int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
	
	
} //비효율적으로 코드를 많이 사용하게 된다

class B{
	int m1,m2,m3,m4;
	B(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B(int a){
		this();
		m1 = a;
		
	}
	B(int a,int b){
		this(a);
		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}	
}


public class ThisMethod_2 {
	public static void main(String[] args) {
		//3가지 객체 생성(this() 미사용)
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10,20);
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println();
		
		//3가지 객체 생성(this() 사용)
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10,20);
		b1.print();
		b2.print();
		b3.print();
	}
}


