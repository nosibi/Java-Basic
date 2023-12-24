package SuperKeyword_02;

class A{
	void abc() {
		System.out.println("A class abc");
	}
}

class B extends A{
	void abc() {
		System.out.println("B class abc");
	}
	void bcd() {
		super.abc(); //super 키워드를 사용하여 부모클래스의 abc 메서드를 호출
	}
}

public class SuperKeyword_2 {
	public static void main(String[] args) {
		//객체 생성
		B b = new B();
		
		//메서드 호출
		b.bcd(); 
	}

}
