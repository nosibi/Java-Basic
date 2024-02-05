package genericMethod_01;

/*클래스 전체를 제네릭으로 선언하는 대신, 일반 클래스 내부의 특정 메서드만 제네릭으로 선언할 수 있음
 *제네릭 클래스와 달리 제네릭 메서드는 호출하는 시점에서 실제 제네릭 타입을 지정
 *참조객체.<실제 제네릭타입>메서드명(입력매개변수)
 *입력매개변수로 제네릭타입의 변수를 사용할 경우 <실제 제네릭타입>의 생략이 가능 
 */

class GenericMethod{
	public <T> T method(T t){
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <K,V> void method3(K k, V v) {
		System.out.println(k + ":" + v);
	}
}

public class GenericMethod_1 {
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		String str1 = gm.<String>method("Hello");
		String str2 = gm.method("Hello2");
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.<Double>method2(2.4, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("Value",3);
		gm.method3("Value", 3);
		
	}

}
