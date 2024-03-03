package referenceOfConstructor_01;

/*생성자 참조에는 2가지 : 배열 생성자 참조, 클래스 생성자 참조
 *인터페이스의 추상메서드가 배열 타입 또는 클래스 타입의 객체를 리턴 할 경우
 *배열 생성자 참조 -> 배열 타입::new
 *클래스 생성자 참조 -> 클래스명::new
 */

interface A{
	int[] abc(int len);
}

interface B{
	C bcd();
}

class C{
	C(){
		System.out.println("constructor1");
	}
	
	C(int k){
		System.out.println("constructor2");
	}
}

public class ReferenceOfConstructor_1 {
	public static void main(String[] args) {
		//배열 생성자 참조
		//1.익명 이너 클래스
		A a1 = new A() {
			public int[] abc(int len) {
				return new int[len];
			}
		};
		
		//2.람다식
		A a2 = (int len) -> {return new int[len];};
		
		//3.배열 생성자 참조
		A a3 = int[]::new;
		
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		int[] array2 = a2.abc(3);
		System.out.println(array2.length);
		int[] array3 = a3.abc(3);
		System.out.println(array3.length);
		
		System.out.println();
		
		//클래스 생성자 참조
		//1.익명 이너 클래스
		B b1 = new B() {
			public C bcd() {
				return new C();
			}
		};
		
		//2.람다식
		B b2 = () -> {return new C();};
		
		//3.클래스 생성자 참조
		B b3 = C::new;
		
		b1.bcd(); // new C()를 실행하여 객체를 생성하라는 의미
		b2.bcd();
		b3.bcd();
		
		
	}

}
