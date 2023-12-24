package ObjectMethod_01;

class A{
	int a = 3;
	int b = 4;
} 

class B{
	int a = 3;
	int b = 4;
	
	public String toString() {
		return "필드값(a,b) : " + a + " " + b;
	} //toString 메서드 오버라이딩
}

public class ObjectMethod_toString {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		B b = new B();
		
		//메서드 호출
		System.out.printf("%x\n", a.hashCode());
		System.out.println(a);
		System.out.println(b);
	} 

}
/*println() 메서드는 객체를 출력하면 자동으로 객체 내의 toString()메서드를 호출한다
 *A클래스의 경우 toString()메서드가 없기 때문에 Object클래스의 toString()메서드가 호출된다 
 *B클래스의 경우 toString()메서드가 있기 때문에 이 메서드가 오버라이딩 되어 출력된다
 *따라서, a와 b의 출력이 다르다
 *object 클래스의 toString()메서드를 호출하면 패키지명.클래스명@해시코드 가 출력된다
 */