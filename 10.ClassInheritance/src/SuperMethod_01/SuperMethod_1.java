package SuperMethod_01;

class A{
	A(){
		System.out.println("A constructor");
	}
}

class B extends A{
	B(){
		//super(); //생략 시 컴파일러가 자동추가
		System.out.println("B constructor");
		
	}
}

class C{
	C(int a){
		System.out.println("C constructor");
	}
}

class D extends C{
	/*
	 D(){
	     super();
	 }
	  컴파일러가 자동으로 추가해주는 내용. 하지만 부모클래스의 생성자가 입력매개변수를 받기 때문에 자동 추가 시 오류가 발생
	 */
	D(){
		super(3);
	}
}

public class SuperMethod_1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println();
		
		B b = new B();
		System.out.println();
		
		D d = new D();
		
	}

}
/*모든 생성자는 첫 줄에 반드시 this() 또는 super()가 있어야 한다
 *만약, 아무것도 써 주지 않으면 컴파일러가 자동으로 super()를 첫 줄에 추가한다 
 *반대로, 첫 줄에 this() 나 this(3)이 있을 경우 super()가 자동으로 추가되지 않는다
 */

