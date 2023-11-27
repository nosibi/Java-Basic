package ClassInnerFactor_02;

//클래스 생성
class A{
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue(){
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalValue() {
		int k;
		//System.out.println(k); //지역변수 k가 초기화되지 않아 오류 발생
	}
}

public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		a.printFieldValue();
		
	}

}
/* Field값은 초기화 시키지 않을 시 강제 초기화가 이루어진다
 * boolean은 flase, 정수형은 0, 실수형은 0.0으로 초기화 된다
 * 참조 자료형의 경우(ex. String) null 값으로 초기화 된다
 * Local Variable은 초기화 시키지 않으면 출력시 오류가 발생한다
 */
