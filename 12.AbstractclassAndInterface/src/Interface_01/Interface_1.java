package Interface_01;

/*인터페이스 내부의 모든 필드는 public static final로 정의된다
 *인터페이스 내부 메서드는 public abstract으로 정의된다 
 *생략시 컴파일러가 자동으로 추가한다
 */
interface A{
	public static final int a = 3;
	public abstract void abc();
}

interface B{
	int b = 4;
	void bcd();
}

public class Interface_1 {
	public static void main(String[] args) {
		System.out.println(A.a); //static의 특징 : 클래스명.필드명으로 호출가능
		System.out.println(B.b);
		
		//A.a = 4; 
		//B.b = 3; //오류 발생. final의 특징 : 한 번 초기화된 변수에 값을 대입할 수 없다
	}

}
