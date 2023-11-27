package ClassInnerFactor_11;

//생성자 오버로딩
//메서드와 마찬가지로 입력매개변수의 자료형,개수에 따라 서로 다른 여러 개의 생성자를 만들 수 있다
//객체 생성 후 생성자의 중괄호 이후 부분이 실행된다

class A{
	A(){
		System.out.println("Constructor1");
	}
	A(int a){
		System.out.println("Constructor2");
	}
	A(int a, int b){
		System.out.println("Constructor3");
	}
}

public class ConstructorOverLoading {
	public static void main(String[] args) {
		//클래스 객체 생성
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(1,3);
		
	}

}
