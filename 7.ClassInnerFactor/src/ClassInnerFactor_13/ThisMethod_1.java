package ClassInnerFactor_13;

//this()메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출하는 명령
//클래스 명이 A일 경우 this()는 A()생성자를 호출하는 것
//this(3)은 A(3),즉 int형 데이터 하나를 입력받는 생성자를 호출하는 것

class A{
	A(){
		System.out.println("Constructor1");
	}
	A(int a){
		this(); //A()를 호출
		System.out.println("Constructor2");
	}
}


public class ThisMethod_1 {
	public static void main(String[] args) {
		//클래스 객체 생성
		A a1 = new A(); //첫 번째 생성자 호출
		
		System.out.println();
		
		A a2 = new A(3); //두 번째 생성자 호출
	}

}
