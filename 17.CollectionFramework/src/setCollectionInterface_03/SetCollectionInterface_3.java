package setCollectionInterface_03;
/*HashSet<E>의 자식클래스 LinkedHashSet<E>
 *HashSet<E>의 모든 기능 + 데이터 간 연결정보
 *입력순서와 출력순서가 동일한 것 외에는 HashSet<E>와 동일함
 *입력 순서의 정보만 가지고 있고 중간에 데이터를 추가하거나 특정 위치의 데이터를 가져오는 것은 불가 
 */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionInterface_3 {
	public static void main(String[] args) {
		Set<String> hSet1 = new LinkedHashSet<>();
		//1.add(E element)
		hSet1.add("A");
		hSet1.add("B");
		hSet1.add("A");
		System.out.println(hSet1.toString()); //중복 저장 불가
		
		//2.addAll(다른 set 객체)
		Set<String> hSet2 = new LinkedHashSet<>();
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
		Set<String> hSet3 = new LinkedHashSet<>();
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
