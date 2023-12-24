package StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5; // 정적 필드 초기화는 static{} 내에서 수행. 클래스가 메모리에 로딩될 시 가장 먼저 실행.
		System.out.println("클래스 A가 로딩되었습니다");
	}
	A(){
		a = 3; // 인스턴스 필드 초기화는 일반적으로 생산자에서 수행. 객체가 생성되어야 실행됨.
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b); //실행 시 static{}이 가장 먼저 실행되므로 b = 5로 초기화되고 출력문도 실행이 된다. 이후 A.b가 출력이 된다.
	}

}
