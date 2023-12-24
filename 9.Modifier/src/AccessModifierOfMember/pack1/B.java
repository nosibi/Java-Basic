package AccessModifierOfMember.pack1;

public class B {
	public void print() {
		//객체 생성
		A a = new A(); //같은 패키지 내에 있기 때문에 객체 생성이 가능
		
		//맴버 활용
		System.out.println(a.a + " ");
		System.out.println(a.b + " ");
		System.out.println(a.c + " ");
		//System.out.println(a.d); // d는 private로 지정되어 있기 때문에 같은 클래스에서만 호출 가능
		System.out.println();
		
	}

}
