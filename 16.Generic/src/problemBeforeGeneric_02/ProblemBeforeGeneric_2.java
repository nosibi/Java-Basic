package problemBeforeGeneric_02;

/*필드를 모든 자바 클래스의 최상위 클래스인 Object 타입으로 선언
 */

class Apple{}
class Pencil{}

class Good{
	private Object object = new Object();
	public Object getObject() {
		System.out.println(object);
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class ProblemBeforeGeneric_2 {
	public static void main(String[] args) {
		Good good1 = new Good();
		Good good2 = new Good();
		good1.setObject(new Apple());
		good2.setObject(new Pencil());
		
		Apple apple = (Apple)good1.getObject(); //저장 타입과 가져오는 타입이 같아야 함. 다운캐스팅 수행
		Pencil pencil = (Pencil)good2.getObject();
		
		
		//Pencil pencil = (Apple)good2.getObject(); 잘못된 캐스팅을 할 경우 ClassCastException이 발생(weak type checking : 잘못된 타입 캐스팅에서 문법적 오류를 발생시키지 않는 것) 
	}

}

/*각 상품마다 클래스를 생성하는 대신, 최상위 클래스인 Object 타입의 필드를 선언하면 모든 타입의 상품을 저장할 수 있는 클래스 생성 가능
 *각 객체를 get()메서드로 가져온 경우 각각의 타입으로 다운캐스팅해야 함
 *이때 "weak type checking" 만 가능하므로 ClassCastException 발생 가능
 *이러한 문제점까지 해결할 수 있는 것이 Generic
 */
