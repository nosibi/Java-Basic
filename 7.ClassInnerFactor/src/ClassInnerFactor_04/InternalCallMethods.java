package ClassInnerFactor_04;

public class InternalCallMethods {
	public static void main(String[] args) {
		//같은 클래스 안에 있는 메서드 호출, 객체 생성 필요없음
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(3, 8.6);
		System.out.println(b);
	}
	
	public static void print() {
		System.out.println("void print");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int m, double n) {
		return m + n;
	}
	
}
/*같은 클래스 내부에서는 메서드 호출 시 포인터 연산자가 필요가 없다
 *또한, 객체 생성을 할 필요가 없다
 *메서드 앞에 static이 붙어 있을 시 static이 붙은 필드 또는 메서드만 호출 가능하다
 */