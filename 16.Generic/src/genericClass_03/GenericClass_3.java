package genericClass_03;

class Apple{}
class Pencil{}

class Good<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class GenericClass_3 {
	public static void main(String[] args) {
		Good<Apple> good1 = new Good<>();
		good1.set(new Apple());
		Apple apple = good1.get(); //다운캐스팅 불필요
		
		Good<Pencil> good2 = new Good<>();
		good2.set(new Pencil());
		Pencil pencil = good2.get(); //다운캐스팅 불필요
		
		Good<Apple> good3 = new Good<>();
		good3.set(new Apple());
		//Pencil pencil = good3.get(); //Strong Type Checking 으로 문법 오류 발생

	}
}
