package AccessModifierOfMember;

import AccessModifierOfMember.pack1.A;
import AccessModifierOfMember.pack1.B;
import AccessModifierOfMember.pack2.C;
import AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
		
	}

}
