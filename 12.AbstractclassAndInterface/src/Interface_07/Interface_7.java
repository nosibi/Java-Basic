package Interface_07;
/*Java8 이후 인터페이스에 추가된 기능은 static 메서드를 포함할 수 있는 것
 *클래스 내부의 정적 메서드와 동일한 기능
 *객체를 따로 생성할 필요 없이 인터페이스명.정적메서드명()으로 호출가능 
 */
interface A{
	static void abc() {
		System.out.println("interface A static method");
	}
}
public class Interface_7 {
	public static void main(String[] args) {
		A.abc();
	}

}
