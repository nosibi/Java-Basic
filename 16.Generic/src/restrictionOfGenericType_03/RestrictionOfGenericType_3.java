package restrictionOfGenericType_03;

/*일반 메서드의 입력 매개변수로서 제네릭 타입 범위 제한
 *접근지정자 리턴타입 메서드명(제네릭클래스명<A> 참조변수명){} : A인 객체만 가능
 *접근지정자 리턴타입 메서드명(제네릭클래스명<?> 참조변수명){} : 모든 타입의 객체 가능
 *접근지정자 리턴타입 메서드명(제네릭클래스명<? extends A> 참조변수명){} : A 또는 A의 자식클래스인 객체 모두 가능
 *접근지정자 리턴타입 메서드명(제네릭클래스명<? super A> 참조변수명){} : A 또는 A의 부모클래스인 객체 모두 가능
 */
class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Good<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get(T t) {
		return t;
	}
}

class Test{
	void method1(Good<A> g) {}
	void method2(Good<?> g) {}
	void method3(Good<? extends B> g) {}
	void method4(Good<? super B> g) {}
}

public class RestrictionOfGenericType_3 {
	public static void main(String[] args) {
		Test t = new Test();
		
		//case1
		t.method1(new Good<A>());
		//t.method1(new Good<B>());
		//t.method1(new Good<C>());
		//t.method1(new Good<D>());
		
		//case2
		t.method2(new Good<A>());
		t.method2(new Good<B>());
		t.method2(new Good<C>());
		t.method2(new Good<D>());
		
		//case3
		//t.method3(new Good<A>());
		t.method3(new Good<B>());
		t.method3(new Good<C>());
		t.method3(new Good<D>());
		
		//case4
		t.method4(new Good<A>());
		t.method4(new Good<B>());
		//t.method4(new Good<C>());
		//t.method4(new Good<D>());
		
	}

}
