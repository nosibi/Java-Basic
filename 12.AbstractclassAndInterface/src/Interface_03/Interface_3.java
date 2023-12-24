package Interface_03;

/*인터페이스 내 메서드는 public 접근지정자를 가진다
 *따라서, 이를 상속하는 자식클래스도 public 접근지정자를 메서드 앞에 사용해야 한다
 *사용하지 않을 시 default 를 접근지정자로 자동 추가하여 오류가 발생한다
 */
interface A{
	public abstract void abc();
}

class B implements A{
	public void abc() {
		System.out.println("인터페이스를 상속하는 클래스");
	}
}

/*class C implements A{
	void abc() {
		
	}
} 오류 발생. 접근지정자가 default로 자동 추가되었기 때문
*/


public class Interface_3 {
	public static void main(String[] args) {
		
	}
}
