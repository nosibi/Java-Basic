package SuperKeyword_01;

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
		abc(); // A클래스의 abc와 B클래스의 abc 중 어떤 것이 호출될 것인가 //this.abc 이므로 B클래스의 메서드가 호출된다
	}
}

public class SuperKeyword_1 {
	public static void main(String[] args) {
		B bb = new B();
		bb.bcd();
	}
	

}
//A클래스의 abc, 즉 부모클래스의 메서드를 호출하기 위해서는 super 키워드를 사용한다