package exceptionMethod_02;

/*Exception 메서드 printStackTrace()
 *예외가 전가되는 과정을 확인 가능
 */
class A{
	void abc() throws NumberFormatException{
		bcd();
	}
	void bcd() throws NumberFormatException{
		cde();
	}
	void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");
	}
}


public class ExceptionMethod_2 {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.cde();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
