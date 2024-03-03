package setCollectionInterface_01;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Set<E> 컬렉션 인터페이스 : index 정보가 없어 중복 저장이 불가, 입력순서와 관계없이 출력, 그외에는 List<E>와 동일
 *구현 클래스로 HashSet<E>, LinkedHashSet<E>, TreeSet<E>
 *HashSet<E> : 저장 용량 동적 관리 가능, 기본 생성자로 생성 시 기본값은 16
 */

public class SetCollectionInterface_1 {
	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		//1.add(E element)
		hSet1.add("A");
		hSet1.add("B");
		hSet1.add("A");
		System.out.println(hSet1.toString()); //중복 저장 불가
		
		//2.addAll(다른 set 객체)
		Set<String> hSet2 = new HashSet<>();
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString());
		
		//3.remove(Object o)
		hSet2.remove("B");
		System.out.println(hSet2.toString());
		
		//4.clear()
		hSet1.clear();
		System.out.println(hSet1.toString());
		
		//5.isEmpty()
		System.out.println(hSet1.isEmpty());
		System.out.println(hSet2.isEmpty());
		
		//6.contains(Object o)
		System.out.println(hSet2.contains("A"));
		
		//7.size()
		System.out.println(hSet2.size());
		System.out.println();
		
		//8.iterator()
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("A");
		hSet3.add("B");
		hSet3.add("C");
		hSet3.add("D");
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		} //iterator.hasNext() : iterator 객체 내 다음으로 가리킬 원소가 있는지 여부를 boolean 출력
		 //iterator.next() : 다음 원소 위치로 가서 읽은 값을 판단
		System.out.println();
		
		//9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //배열을 출력
		
		//10.toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray1));
	}

}
