package listCollectionInterface_04;
/*Vector<E> 구현 클래스 : ArrayList<E>와 메서드 기능/사용법 동일
 *동기화 메서드로 구현되어 있어 멀티 쓰레드에 적합
 *ArrayList<E>와 동일한 기능을 수행하지만, 멀티쓰레드에서 사용할 수 있도록 기능이 추가됨
 *싱글 쓰레드에서는 많은 리소스를 차지하는 Vector<E>보다 ArrayList<E>를 사용하는 것이 더 효율적
 */
/*LinkedList<E> 구현 클래스 : 마찬가지로 ArrayList<E>와 동일하지만 1.저장 용량을 매개변수로 갖는 생성자가 없기 때문에 저장 용량 지정 불가 2.내부적으로 데이터 저장 방식이 앞뒤 객체의 정보를 저장하는 방식임
 *데이터 추가,제거는 LinkedList<E>를, 데이터 검색에서는 ArrayList<E>를 사용하는 것이 효율적임 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollectionInterface_4 {
	public static void main(String[] args) {
		// 1.데이터 추가 시간 비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1.ArrayList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가 시간 = " + (endTime - startTime) + " ns");
		
		// 1-2.LinkedList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가 시간 = " + (endTime - startTime) + " ns");
		
		
		System.out.println();
		
		// 2-1.ArrayList 데이터 검색 시간
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 검색 시간 = " + (endTime - startTime) + " ns");
		
		// 2-2.LinkedList 데이터 검색 시간
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 검색 시간 = " + (endTime - startTime) + " ns");
		
	}

}
/*데이터 추가,제거는 LinkedList가, 검색은 ArrayList가 더 빠른 것을 알 수 있음
 */ 
