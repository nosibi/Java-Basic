package Class_01;

//1.클래스의 정의
class A {
	int m = 3; // field
	void print() {
		System.out.println("객체 생성 및 활용"); // method
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		//2.클래스로 객체 생성
		A a = new A(); // constructor(클래스 A의 객체 생성자)
		
		//3.클래스 맴버 활용
		//3-1.필드 활용 : 필드에 값을 읽기/쓰기
		System.out.println(a.m);
		a.m = 5;
		System.out.println(a.m);
		
		//3-2.메서드 활용 : 메서드 호출
		a.print();
		
		
	}

}
/* 정리
 * 1개의 클래스에서 여러 개의 Field는 1개의 Method를 공유한다
 * Method가 다르다는 것은 Class도 다르다는 것이다
 * 객체를 생성하기 위해서는 객체 생성자가 필요하다
 * 객체 생성은 클래스명 참조변수 = new 클래스명(); 이다
 * 여기서 클래스명()가 객체 생성자를 의미한다
 * 클래스의 객체는 생성 후 실제 데이터값은 Heap Memory에 저장된다
 * Heap Memory에 직접 접근하는 것은 불가능하기 때문에 포인트 연산자를 이용하여 접근할 수 있다
 * 참조변수.필드 또는 참조변수.메서드를 이용하여 클래스 맴버를 활용할 수 있다
 */
