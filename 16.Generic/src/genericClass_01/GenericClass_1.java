package genericClass_01;

/*제네릭 타입 변수명은 사용자가 임의로 지정 가능. 일반적으로 영문 대문자 1글자를 사용
 *객체 생성 : 클래스명<실제 제네릭 타입> 참조변수명 = new 클래스명<실제 제네릭 타입>();
 *제네릭 클래스는 클래스를 정의하는 시점에 타입을 지정하는 것이 아니다
 *객체를 생성하는 시점에 타입을 지정
 *잘못된 캐스팅 시 String Type Checking 발생(문법 오류 발생시킴)
 */
class MyClass<T>{
	private T t; //필드 타입으로 사용
	public T get() {
		return t;
	} //리턴 타입으로 사용
	public void set(T t){
		this.t = t;
	} //입력 타입으로 사용
}

public class GenericClass_1 {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass();
		MyClass<Integer> mc2 = new MyClass();
		MyClass<Integer> mc3 = new MyClass();
		
		mc1.set("Hello");
		System.out.println(mc1.get());
		
		mc2.set(40);
		System.out.println(mc2.get());
		
		//mc3.set("Hello");
		//System.out.println(mc3.get());
		//Strong Type Checking 발생
	}

}
