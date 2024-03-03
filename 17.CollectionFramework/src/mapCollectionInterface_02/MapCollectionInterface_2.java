package mapCollectionInterface_02;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.NavigableSet;

/*TreeMap<K,V> : Map<K,V> 에서 정렬 및 검색 기능이 추가. 입력순서와 관계없이 데이터를 Key 값의 크기 순으로 지정
 *TreeSet<E> 와 비슷하게 TreeMap<K,V> 는 SortedMap<K,V>, NavigableMap<K,V> 를 상속
 *TreeMap<K,V> 생성자로 객체를 생성하여도 Map<K,V> 타입으로 선언한 경우 정렬 및 검색 기능을 사용할 수 없음
 *주요 메서드는 다른 구현 클래스와 동일하고 정렬과 검색 관련 메서드만 추가 
 */

public class MapCollectionInterface_2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> treemap = new TreeMap<>();
		for(int i = 20; i > 0; i -= 2) {
			treemap.put(i, i + "번째 데이터");
		}
		System.out.println(treemap.toString()); //크기에 따른 오름차순으로 출력. 입력순서와 관계 없음
		
		System.out.println();
		
		//1. 데이터 검색
		//firstKey(), lastKey()
		System.out.println(treemap.firstKey());
		System.out.println(treemap.lastKey());
		//firstEntry(),lastEntry() : key,value 형태로 출력
		System.out.println(treemap.firstEntry());
		System.out.println(treemap.lastEntry());
		//lowerKey(key), higherKey(key) : 미만/초과 key
		System.out.println(treemap.lowerKey(12));
		System.out.println(treemap.higherKey(12));
		//lowerEntry(key), higherEntry(key)
		System.out.println(treemap.lowerEntry(12));
		System.out.println(treemap.higherEntry(12));
		
		System.out.println();
		
		//2. 데이터 추출
		TreeMap<Integer,String> treemap2 = new TreeMap<>();
		for(int i = 10; i > 0; i -= 2) {
			treemap2.put(i, i + "번째 데이터");
		}
		System.out.println("treemap2 : " + treemap2.toString());
		//pollFirstEntry(),pollLastEntry()
		System.out.println(treemap2.pollFirstEntry());
		System.out.println("treemap2 : " + treemap2.toString());
		
		System.out.println(treemap2.pollLastEntry());
		System.out.println("treemap2 : " + treemap2.toString());
		
		//3. 데이터 부분집합 생성
		TreeMap<Integer,String> treemap3 = new TreeMap<>();
		for(int i = 20; i > 0; i -= 2) {
			treemap3.put(i, i + "번째 데이터");
		}
		System.out.println("treemap3 : " + treemap3.toString());
		System.out.println();
		//1) SortedMap<K,V>
		//headMap(toKey) : toKey 미만 , tailMap(fromKey) : fromKey 이상
		SortedMap<Integer,String> smap = treemap3.headMap(8); //8 미만의 Key 값들의 부분 집합 생성
		System.out.println("smap : " + smap.toString());
		SortedMap<Integer,String> smap2 = treemap3.tailMap(8); //8 미만의 Key 값들의 부분 집합 생성
		System.out.println("smap2 : " + smap2.toString());
		//subMap(fromKey, toKey) : fromKey 이상 toKey 미만 
		SortedMap<Integer,String> smap3 = treemap3.subMap(8,20);
		System.out.println("smap3 : " + smap3.toString());
		
		System.out.println();
		
		//2)NavigableMap<K,V>
		//headMap(toKey,boolean inclusive) : true 일 경우 toKey 이하, false 일 경우 미만, tailMap(fromKey, boolean inclusive)
		SortedMap<Integer,String> smap4 = treemap3.headMap(8,true); //8 이하의 Key 값들의 부분 집합 생성
		System.out.println("smap4 : " + smap4.toString());
		SortedMap<Integer,String> smap5 = treemap3.tailMap(8,false); //8 초과의 Key 값들의 부분 집합 생성
		System.out.println("smap5 : " + smap5.toString());
		//subMap(fromKey, boolean frominclusive, toKey, boolean toinclusive) : fromKey 에서 toKey 까지. inclusive 가 true/false 일경우 포함/미포함
		SortedMap<Integer,String> smap6 = treemap3.subMap(8,false,20,true);
		System.out.println("smap6 : " + smap6.toString());
		
		System.out.println();
		
		//4. 데이터 정렬
		System.out.println("treemap3 : " + treemap3.toString());
		//NavigableSet<K> descendingKeySet() : Map 에 포함된 모든 Key 값의 정렬을 반대로 변환한 Set 객체 리턴
		NavigableSet<Integer> navigableset = treemap3.descendingKeySet();
		System.out.println(navigableset); // Key 값을 Set 객체로 리턴
		System.out.println(navigableset.descendingSet()); // descendingSet 으로 정렬 기준 역전
		//NavigableMap<K,V> descendingMap() : Map 에 포함된 모든 Key 값의 정렬을 반대로 변환한 Map 객체 리턴
		NavigableMap<Integer,String> navigablemap = treemap3.descendingMap();
		System.out.println(navigablemap);
	}

}
