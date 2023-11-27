package ClassInnerFactor_08;

public class MethodOverLoading {
	public static void main(String[] args) {
		print();
		print(3);
		print(3.8);
		print(3, 1.8);
		
	}
	
	public static void print() {
		System.out.println("method1");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	public static void print(int a, double b) {
		System.out.println("a : " + a + " " + "b : " + b);
	}
	

}
/*method의 이름이 같아도 입력매개변수의 개수나 자료형이 다르면 다른 메서드로 인식
 *즉, method signature가 다르면 다른 method가 된다
 *return type은 method signature에 해당하지 않는다
 *리턴 타입 메서드명(입력매개변수) 
 */
