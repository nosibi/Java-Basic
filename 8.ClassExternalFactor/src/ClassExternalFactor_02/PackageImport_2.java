package ClassExternalFactor_02;
//import를 사용하여 다른 패키지 내 클래스 사용
import packageimport.common.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		
		//멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
/*import를 사용하는 것이 더 편리하지만 풀네임으로 클래스를 호출하는 방법도 알아야 함
 *예를 들어 packA 와 packB 라는 서로 다른 패키지에 각각 A라는 클래스가 있을 경우 
 *두 패키지에 있는 A클래스를 동시에 사용하고자 할 경우 import를 사용하면 중복이 되므로 불가함
 *따라서, 이러한 경우에는 풀네임으로 호출해야 한다. packA.A , packB.A 
 */
