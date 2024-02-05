package restrictionOfGenericType_01;

/*제너릭 타입 범위 제한을 할 경우 제한한 클래스 또는 그 자식 클래스와 같은 타입만 지정가능
 *제네릭 타입 범위 제한 방법 : 1.제네릭 클래스에서 제네릭 타입을 제한 2.제네릭 메서드에서 제네릭 타입을 제한 3.일반 메서드의 매개변수로서 제네릭 클래스의 타입 제한
 *메서드를 정의하는 과정에서 과정에서 제네릭 타입의 범위를 제한함
 */

//1.제네릭 클래스에서 제네릭 타입 제한할 경우

class A{}
class B extends A{}
class C extends B{}

class D<T extends B>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
} //여기서 extends 는 상속의 의미가 아닌 "최상위 클래스/인터페이스로 지정한다"라는 의미
// B클래스를 지정했으므로 B클래스 또는 B클래스의 자식 클래스만 제네릭 타입으로 올 수 있음

public class RestrictionOfGenericType_1 {
	public static void main(String[] args) {
		D<B> db = new D<>();
		D<C> dc = new D<>();
		D dd = new D(); //D<B> dd = new D<>();
		
		db.set(new B());
		db.set(new C());
		
		//dc.set(new B()); 객체 생성 시 제네릭 타입으로 C를 지정하므로 B객체는 입력 불가
		dc.set(new C());
		
	}

}
