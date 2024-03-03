package listCollectionInterface_03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*ArrayList<E>
 *add() : 데이터 추가 / add(1) - 기존 데이터 뒤에 1추가, add(1,4) - 1번째 인덱스에 4추가
 *set() : 데이터 변경 / set(1,4) - 1번째 인덱스 데이터를 4로 변경, 없는 인덱스의 위치에 값을 대입할 경우 IndexOutBoundsException 발생
 *remove() : 특정 데이터 삭제(특정 위치 또는 특정 원소 삭제) / remove(1) - 1번째 인덱스 데이터 삭제, remove(new Integer(2)) - 2라는 데이터 값 삭제
 *clear() : 데이터 전체 삭제
 *isEmpty() : 데이터 존재 여부 확인, boolean 형으로 리턴
 *size() : 저장 데이터의 개수
 *get(int index) : 특정 위치의 인덱스 값 리턴
 */



public class ListCollectionInterface_3 {
	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<>();
		//1. add()
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		//2. set()
		aList1.set(1, 6);
		System.out.println(aList1.toString());
		
		//3. addAll(또 다른 리스트 객체)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		//4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList3);
		System.out.println(aList3);
		
		//5. remove()
		aList3.remove(1); //1번째 인덱스 삭제
		System.out.println(aList3);
		
		//6. remove(Object o)
		aList3.remove(new Integer(3));
		System.out.println(aList3);
		
		//7. clear()
		aList3.clear();
		System.out.println(aList3);
		
		//8.isEmpty()
		System.out.println(aList3.isEmpty());
		
		//9.size()
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3.size());
		
		//10.get(int index)
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "번째 : " + aList3.get(i));
		}
		
		//11.toArray() : List -> Array
		Object[] object = aList3.toArray();
		System.out.println(Arrays.toString(object));
		
		//12.toArray(T[] t) : 특정타입의 배열 객체 생성
		Integer[] integer1 = aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		Integer[] integer2 = aList3.toArray(new Integer[5]); //크기가 5개인 배열이므로 배열의 앞부분부터 데이터를 넣어 리턴하고 남은 부분은 null 처리
		System.out.println(Arrays.toString(integer2));
	}

}
