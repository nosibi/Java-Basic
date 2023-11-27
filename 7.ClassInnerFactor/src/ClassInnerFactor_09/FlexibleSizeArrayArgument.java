package ClassInnerFactor_09;

//가변 길이 배열 입력매개변수
//입력매개변수의 개수가 유동적일 경우 여러 개의 메서드를 만드는 것은 비효율적임

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		//method1(int... values)
		method1(1,2);
		method1(1,2,3);
		method1();
		
		//method2(String... values)
		method2("Hello","Java");
		method2("Python","Kotlin");
		method2("Swift","JavaScript");
		
	}
	
	public static void method1(int... values) {
		System.out.println("배열의 길이 : " + values.length);
		for(int k : values) {
			System.out.println(k + " ");
		}
	}
	
	public static void method2(String... values) {
		System.out.println("배열의 길이 : " + values.length);
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " ");
		}
	}

}
