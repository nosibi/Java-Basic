package setCollectionInterface_04;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.SortedSet;

/*TreeSet<E> : 데이터의 입력 순서와 관계없이 크기순으로 출력. Set<E> 기능에 크기에 따른 정렬 및 검색 기능 추가
 *Navigable Set<E> SortedSet<E>를 부모 인터페이스로 둠
 *Set<E>타입으로 선언할 경우 정렬 및 검색 기능 사용 불가(TreeSet<E>타입으로 선언해야함) 
 */

public class SetCollectionInterface_4 {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>();
		for(int i = 50; i > 0; i -= 2) {
			treeset.add(i);
		}
		System.out.println(treeset.toString());
		System.out.println();
		
		//1.데이터 검색
		System.out.println(treeset.first());
		System.out.println(treeset.last());
		System.out.println(treeset.lower(26)); //입력매개변수보다 작은 원소
		System.out.println(treeset.higher(26));
		System.out.println(treeset.floor(25)); //입력매개변수보다 같거나 작은 원소
		System.out.println(treeset.floor(26));
		System.out.println(treeset.ceiling(25));
		System.out.println(treeset.ceiling(26));
		
		System.out.println();
		
		//2.데이터 꺼내기
		//pollFirst() : 가장 작은 원소값을 꺼내어 리턴. 하나씩 없어져감
		int treeSetSize = treeset.size();
		System.out.println("treeSetSize = " + treeSetSize);
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeset.pollFirst());
		}
		System.out.println("treeSetSize = " + treeset.size());
		//pollLast() : 반대로 가장 큰 원소값을 꺼내어 리턴
		System.out.println();
		
		//3.데이터 부분 집합 생성
		System.out.println(treeset); //위에서 데이터를 전부 꺼내었기 때문에 비워져있음
		System.out.println();
		for(int i = 0; i < 50; i += 2) {
			treeset.add(i);
		}
		System.out.println(treeset);
		System.out.println();
		
		//headSet<E>
		//SortedSet<E> headSet(E toElement) : toElement 미만의 원소로 구성된 부분 집합 생성
		SortedSet<Integer> sSet = treeset.headSet(20);
		System.out.println(sSet.toString());
		//NavigableSet<E> headSet(E toElement, boolean inclusive) : inclusive 가 true 일 경우 toElement 이하, false 일 경우 미만
		NavigableSet<Integer> nSet = treeset.headSet(20, true);
		System.out.println(nSet.toString());
		System.out.println();
		
		
		//tailSet<E>
		//SortedSet<E> tailSet(E toElment) : toElement 이상의 원소로 구성된 부분 집합 생성
		SortedSet<Integer> sSet2 = treeset.tailSet(18);
		System.out.println(sSet2.toString());
		//NavigableSet<E> tailSet(E toElement, boolean inclusive) : inclusive 가 true 일 경우 toElement 이상, false 일 경우 초과
		NavigableSet<Integer> nSet2 = treeset.tailSet(18, false);
		System.out.println(nSet2.toString());
		System.out.println();
		
		//subSet<E>
		//SortedSet<E> subSet(E fromeElement,E toElement) : fromElement 이상 toElement 미만 원소 부분 집합
		SortedSet<Integer> aSet = treeset.subSet(4, 30);
		System.out.println(aSet.toString());
		//NavigableSet<E> subSet(E fromElement, boolean frominclusive, E toElement, boolean toinclusive) : inclusive 가 true 일 경우 포함, flase 일 경우 미포함
		NavigableSet<Integer> aSet2 = treeset.subSet(4,false,30,true);
		System.out.println(aSet2.toString());
		
		System.out.println();
		
		//4.데이터 정렬
		//NavigableSet<E> descendingSet() : 현재의 정렬기준을 바꾸는 메서드. 오름차순일 경우 내림차순으로
		System.out.println(treeset);
		NavigableSet<Integer> dSet = treeset.descendingSet();
		System.out.println(dSet.toString());
	}

}
