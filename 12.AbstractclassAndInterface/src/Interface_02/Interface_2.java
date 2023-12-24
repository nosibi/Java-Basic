package Interface_02;

/*인터페이스는 다중 상속이 가능하다. 모든 필드가 public static final로 정의되어 저장 공간이 분리되어 있기 때문
 *같은 타입끼리는 extends, 다른 타입끼리는 implements
 *단,인터페이스가 클래스를 상속할 수는 없다
 */
interface A{}
interface B{}

class C implements A{}
class D implements A,B{}

class E extends C implements A,B{} //순서 변경 불가능. 클래스와 인터페이스를 전부 상속할 시에는 extends, implements 순으로 사용

//interface C implements E{} //오류발생

public class Interface_2 {
	public static void main(String[] args) {
		
	}
}
