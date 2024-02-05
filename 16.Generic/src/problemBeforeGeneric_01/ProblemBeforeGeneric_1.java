package problemBeforeGeneric_01;

class Apple{}
class Good1{
	private Apple apple = new Apple();
	public Apple getApple() {
		System.out.println("Apple");
		return apple;
	} // 리턴 타입이 Apple 인 메서드
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Pencil{}
class Good2{
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		System.out.println("Pencil");
		return pencil;
	}
	public void setPencil(Pencil pencil){
		this.pencil = pencil;
	}
}

/*새로운 상품이 추가될 때마다 새로운 상품 클래스를 추가해야 하나? 너무 비효율적
 *최상위 클래스 Object 를 선언 타입으로 이용하자 
 */

public class ProblemBeforeGeneric_1 {
	public static void main(String[] args) {
		Good1 good1 = new Good1();
		Good2 good2 = new Good2();
		
		good1.setApple(new Apple());
		good2.setPencil(new Pencil());
		
		good1.getApple();
		good2.getPencil();
	}

}
