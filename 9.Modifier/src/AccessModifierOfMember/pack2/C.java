package AccessModifierOfMember.pack2;

import AccessModifierOfMember.pack1.A;

public class C {
	public void print() {
		//객체 생성
		A a = new A();
		
		//맴버 활용
		System.out.println(a.a + " ");
		//System.out.println(a.b + " "); //protected : 다른 패키지 자식 클래스까지 가능
		//System.out.println(a.c + " "); //default : 동일 패키지에서만 가능
		//System.out.println(a.d + " "); //private : 동일 클래스에서만 가능
		System.out.println();
	}
	
}
