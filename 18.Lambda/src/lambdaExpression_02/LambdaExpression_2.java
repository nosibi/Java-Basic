package lambdaExpression_02;
/*람다식 기본 문법 : (입력매개변수) -> {메서드 내용;}
 *람다식 약식 표현
 *중괄호 내 실행문이 1개일 경우 생략 가능. 2개 이상일 경우 생략 불가
 *소괄호 내 입력매개변수가 1개인 경우 생략 가능. 단, 생략 시 입력매개변수의 자료형을 반드시 생략해야 함
 *메서드가 return 문 1개로만 이루어져 있을 경우 return 생략 가능. 단, return 생략 시 중괄호도 반드시 생략해야 함 
 */
interface A{
	void abc();
}

public class LambdaExpression_2 {
	public static void main(String[] args) {
		A a1 = () -> {System.out.println("basic");};
		a1.abc();

		//1.중괄호 내 실행문 1개일 경우 생략 가능
		A a2 = () -> System.out.println("생략 가능");
		a2.abc();
		
		//2.매개변수 타입의 생략 가능
		/*
		 * A a = (int a) -> {method;};
		 * A a = (a) -> {method;};
		 * A a = a -> {method;};
		 * A a = int a -> {method;}; (x) // 소괄호 생략 시 매개변수 자료형도 생략해야함
		*/
		
		//3. return 생략 가능
		/* A a = (int a, int b) -> {return a + b;};
		 * A a = (int a, int b) -> a + b;
		 * A a = (int a, int b) -> {a + b;}; (x) //return 생략 시 중괄호도 생략해야 함
		 */
	}

}
