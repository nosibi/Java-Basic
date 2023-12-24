package StaticField_01;

class A{
	int m = 3; //instance field
	static int n = 5; //static field
}

public class StaticField_1 {
	public static void main(String[] args) {
		//instance field 활용(객체 생성 후 사용 가능)
		A a1 = new A();
		System.out.println(a1.m);
		
		//static field 활용
		//1. 객체 생성 없이 클래스명으로 바로 활용
		System.out.println(A.n);
		
		//2. 객체 생성 후 활용(권장하지 않음)
		A a2 = new A();
		System.out.println(a2.n);
	}
	

}
