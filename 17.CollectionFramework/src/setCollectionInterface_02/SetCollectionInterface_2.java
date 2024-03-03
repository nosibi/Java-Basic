package setCollectionInterface_02;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*HashSet<E> 중복 확인 메커니즘(두 객체가 같은지, 다른지의 기준)
 *1단계 : hashCode()메서드를 이용한 두 객체 비교
 *2단계 : equals()메서드를 이용한 두 객체 비교
 *1단계에서 두 객체가 다른 결과가 나올 경우 2단계는 진행되지 않음
 *hashCode(),equals()의 오버라이딩 유무에 따라 결과가 다르게 나옴
 */
class A{
	int data;
	public A(int data) {
		this.data = data;
	}//생성자 입력매개변수가 data 값에 대입
}

class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	//override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.data == ((B) obj).data)
				return true;
		}
		return false;
	}
}

class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	//override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C) obj).data)
				return true;
			}
		return false;
		}
	//override
	public int hashCode() {
		//return Objects.hash(data); 이런 방식도 가능
		return data;
	}
}

public class SetCollectionInterface_2 {
	public static void main(String[] args) {
		//1. 오버라이딩 하지 않을 경우
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + " " + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println(hashSet1.size()); //두 객체가 같다면 저장 크기가 1이 되어야 한다
		System.out.println();
		
		//2. equals()메서드만 오버라이딩
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + " " + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size());
		System.out.println();
		
		//3. 모두 오버라이딩
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " " + c2.hashCode());
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
		System.out.println();
	}

}
