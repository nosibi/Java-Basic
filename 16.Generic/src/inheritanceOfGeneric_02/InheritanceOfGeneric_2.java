package inheritanceOfGeneric_02;

/*제네릭 메서드를 포함한 일반 클래스를 상속해 자식 클래스를 생성할 경우, 부모 클래스 내의 제네릭 메서드는 그대로 상속
 */
class Parent{
	public <T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent{
	
}

public class InheritanceOfGeneric_2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.<Integer>print(10);
		
		Child c = new Child();
		c.<Double>print(4.3);
	}

}
