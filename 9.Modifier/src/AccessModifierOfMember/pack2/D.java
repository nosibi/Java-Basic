package AccessModifierOfMember.pack2;

import AccessModifierOfMember.pack1.A;

public class D extends A{ //D클래스는 A클래스의 자식클래스
	public void print() {
		//맴버 활용
		System.out.println(a + " ");
		System.out.println(b + " ");
		//System.out.println(c + " ");
		//System.out.println(d + " ");
		System.out.println();
	}

}
