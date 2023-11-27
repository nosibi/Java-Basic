package ClassInnerFactor_03;

//클래스 정의
class A{
	
	//return type void, 입력매개변수 x
	void print() {
		System.out.println("Method1 Of A");
	}
	
	//return type int, 입력매개변수 x
	int data() {
		return 3;
	}
	
	//return type double, 입력매개변수 2개
	double sum(int a, double b) {
		return a + b;
	}
	
	//return type void, 내부에 리턴 포함(함수를 종료)
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월");
	}
}

public class ExternalCallMethods {
	public static void main(String[] args) {
		//객체 생성(외부에서)
		A a = new A();
		
		//메서드 호출
		a.print();
		int k = a.data(); //k에 return값 할당
		a.data();
		System.out.println(k);
		double result = a.sum(1, 3.8);
		System.out.println(result);
		a.printMonth(13);
		a.printMonth(3);
	}

}
