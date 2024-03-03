package mapCollectionInterface_01;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/*Map<K,V>의 대표적인 구현 클래스 HashMap<K,V>, LinkedHashMap<K,V>, Hashtable<K,V>, TreeMap<K,V>
 *HashMap<K,V> : Key 값을 HashSet<E>로 구현한 Map<K,V> 객체. 단일 쓰레드에 적합함
 *Hashtable<K,V> : 동기화된 메서드가 Map<K,V>에 구현되어 있어 멀티 쓰레드에 안정성을 가짐. 그 외에는 HashMap<K,V>와 동일
 *LinkedHashMap<K,V> : 입력 데이터의 순서 정보를 추가로 가지는 것 외에 HashMap<K,V>과 동일. Key 값을 LinkedHashSet<E>으로 구현.
 */

public class MapCollectionInterface_1 {
	public static void main(String[] args) {
		//1.데이터 추가
		//put(key,value)
		Map<Integer,String> hMap1 = new HashMap<>();
		hMap1.put(2, "A");
		hMap1.put(1, "C");
		hMap1.put(3, "D");
		System.out.println(hMap1.toString()); //입력순서와 불일치
		
		//putAll(Map<? extends K, ? extends V> m)
		Map<Integer,String> hMap2 = new HashMap<>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		
		//2.데이터 변경
		//replace(key,value)
		hMap2.replace(1, "CCC");
		hMap2.replace(4, "SS"); //해당되는 Key 값이 없기 때문에 작동하지 않음
		System.out.println(hMap2.toString());
		//replace(key,old value,new value)
		hMap2.replace(1,"CCC","A");
		hMap2.replace(2,"BBB","A"); //해당하는 엔트리가 없기 때문에 작동하지 않음
		System.out.println("hMap2 : " + hMap2.toString());
		
		//3.데이터의 정보 추출
		//get(Object Key)
		System.out.println(hMap1.get(1));
		System.out.println(hMap1.get(2));
		//containsKey(Object Key) : Key 값과 인덱스값을 헷갈리면 안됨. Key 값은 String 으로도 가능
		System.out.println(hMap1.containsKey(5));
		//containsValue(Object Value)
		System.out.println(hMap1.containsValue("A"));
		//Set<K> keySet() : Map 데이터들 중 Key 들만 뽑아 Set 객체로 리턴
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet.toString());
		//Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet.toString()); // Map 의 각 엔트리(Key,Value 쌍 데이터)들을 Set 객체로 담아 리턴
		//size()
		System.out.println(hMap2.size()); // Map 에 포함된 엔트리의 개수
		
		//4. 데이터 삭제
		Map<Integer,String> hMap3 = new HashMap<>();
		hMap3.putAll(hMap2);
		hMap3.replace(2, "B");
		System.out.println(hMap3.toString());
		//remove(Object Key)
		hMap3.remove(3);
		System.out.println(hMap3.toString());
		//remove(Object Key, Object Value)
		hMap3.remove(2,"B");
		hMap3.remove(1,"C"); //작동하지 않음
		System.out.println(hMap3.toString());
		//clear()
		System.out.println(entrySet.toString());
		entrySet.clear();
		System.out.println(entrySet.toString());
	}

}
