package lambdaExpression_03;
/*함수형 인터페이스의 객체를 생성하기 위한 람다식 표현 방법 
 */
interface A{
	void method1();
}

interface B{
	void method2(int a);
}

interface C{
	int method3();
}

interface D{
	double method4(int a, double b);
}

public class LambdaExpression_3 {
	public static void main(String[] args) {
		// 인터페이스의 함수 구현 -> 람다식
		
		//1. 입력매개변수 x, return x
		//익명 이너 클래스로 표현
		A a1 = new A() {
			public void method1() {
				System.out.println("method1");
			}
		};
		//람다식으로 표현
		A a2 = () -> {System.out.println("람다식으로 표현1");};
		A a3 = () -> System.out.println("한 줄 명령이면 중괄호 생략 가능");
		
		//2. 입력매개변수 o, return x
		//익명 이너 클래스로 표현
		B b1 = new B() {
			public void method2(int a) {
				System.out.println("method2");
			}
		};
		//람다식으로 표현
		B b2 = (int a) -> {System.out.println("람다식으로 표현2");};
		B b3 = a -> System.out.println("입력매개변수 자료형 및 1개일 경우 소괄호 생략가능, 한 줄 명령 중괄호 생략 가능");
		
		//3. 입력매개변수 x, return o
		//익명 이너 클래스로 표현
		C c1 = new C() {
			public int method3() {
				return 4;
			}
		};
		//람다식
		C c2 = () -> {return 4;};
		C c3 = () -> 4; //실행문에 return 만 있을 경우 return 생략 가능. return 생략 시 중괄호 생략 가능
		
		//4. 입력매개변수 o, return o
		//익명 이너 클래스로 표현
		D d1 = new D() {
			public double method4(int a, double b) {
				return a + b;
			}
		};
		//람다식
		D d2 = (int a, double b) -> {return a + b;};
		D d3 = (a,b) -> a + b;
		
	}

}
