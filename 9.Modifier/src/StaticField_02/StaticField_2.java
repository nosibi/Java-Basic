package StaticField_02;

class A{
	int m = 3; //instance field
	static int n = 5; //static field
}
public class StaticField_2 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		//instance field
		a1.m = 1;
		a2.m = 2;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		//static field
		a1.n = 3;
		a2.n = 4;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}

}
/* instance field 는 객체 생성 후 객체에 실제 데이터 값을 저장한다
 * 예를 들어 a1,a2라는 2개의 객체를 생성하게 되면 각각 실제 데이터 값을 저장한다
 * a1에 있는 instance field 값을 변경하여도 a2에 있는 instance field 값은 변경되지 않는다
 * 반면, static field 의 경우 위칫값을 전달하기 때문에 어느 객체에 있는 static field 값을 변경해도 동일하게 변경된다
 * 따라서, static field 는 객체 간 공유 변수의 성질이 있다
 * 은행통장 클래스로 100명의 은행통장의 객체를 생성하였을 경우
 * 이자 field 는 static field 로 구성하는 것이 적절하다
 * 금리 변동 시 100명의 이자를 일일히 바꿀 필요가 없기 때문이다
 * */
 