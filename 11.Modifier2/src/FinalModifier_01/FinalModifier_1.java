package FinalModifier_01;

class A1{
	int a = 3;
	final int b = 3;
	A1(){
		
	}
}

class A2{
	int a;
	final int b;
	A2(){
		a = 3;
		b = 5;
	}
}

class A3{
	int a = 3;
	final int b = 5;
	A3(){
		a = 5;
		//b = 5; //final 필드는 초기화 이후 값을 대입할 수 없음
	}
	
}

class A4{
	void abc() {
		int a = 3;
		final int b = 5;
		a = 7;
		//b = 7; //final 지역변수도 마찬가지로 초기화 이후 값의 대입이 불가 //메서드 내의 변수이므로 지역변수임. 필드값은 아니다
		System.out.println(b);
	}
}

public class FinalModifier_1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		
		System.out.println(a1.a);
		System.out.println(a2.b);
		System.out.println(a3.a);
		//System.out.println(a4.b);
		a4.abc();
		
	}

}
