package ClassExternalFactor_01;
//다른 패키지 내의 클래스 사용
//패키지명.클래스명

public class PackageImport_1 {
	public static void main(String[] args) {
		//객체 생성
		packageimport.common.A a = new packageimport.common.A();
		
		//멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
