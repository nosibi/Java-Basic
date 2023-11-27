package ClassInnerFactor_01;

//클래스 생성
class A{
	int m = 3; //field
	int n = 4; //field
	void work1() {
		int k = 5; //local variable
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4; //local variable
		System.out.println(i + j);
	}
}

public class FieldComponent {
	public static void main(String[] args) {
		//클래스로 객체 생성
		A a = new A(); // constructor
		
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		
		//메서드 호출
		a.work1();
	}

}
