package inheritanceOfGeneric_01;

/*제네릭 상속 : 제네릭 클래스 상속, 제네릭 메서드 상속
 *부모 클래스가 제네릭 클래스일 경우 이를 상속한 자식 클래스도 제네릭 클래스가 됨
 *제네릭 타입 변수를 자식 클래스가 그대로 물려받음
 *또한, 자식 클래스는 제네릭 타입 변수를 추가하여 정의 가능
 */
class Parent<T>{
	T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T>{
	//부모클래스의 제네릭 타입 변수, 메서드를 물려받음
}

class Child2<T,V> extends Parent<T>{
	V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceOfGeneric_1 {
	public static void main(String[] args) {
		Parent<String> p = new Parent<>();
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		
		Child1<String> c1 = new Child1<>();
		c1.setT("제네릭타입 변수를 추가하지 않은 자식클래스");
		System.out.println(c1.getT());
		
		Child2<Integer,String> c2 = new Child2<>(); //T 타입에 Integer, V 타입에 String 입력
		c2.setV("제네릭타입 변수를 추가한 자식 클래스");
		c2.setT(200);
		System.out.println(c2.getT() + " " + c2.getV());
		
		
		
	}

}
