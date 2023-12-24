package SuperMethod_02;

class A{
	A(){
		this(3); //2번째 생성자 호출
		System.out.println("A constructor1"); //this(3) 이후 실행
	}
	A(int a){
		System.out.println("A constructor2");
	}
}

class B extends A{
	B(){
		this(3); //this(3)이 있으므로 super()가 자동으로 추가되지 않음
		System.out.println("B constructor1");
	}
	B(int b){ //super() 자동으로 추가
		System.out.println("B constructor2");
		
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println();
		
		A a2 = new A(2);
		System.out.println();
		
		B b1 = new B();
		System.out.println();
		
		B b2 = new B(2);
		
	}

}
