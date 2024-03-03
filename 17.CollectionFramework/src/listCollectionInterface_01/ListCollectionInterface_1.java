package listCollectionInterface_01;
/*컬렉션 인터페이스로 선언은 가능하지만 객체 생성은 구현 클래스로 해야함
 *따라서, List<Integer> list1 = new List<>(); 이런 방식은 불가능
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollectionInterface_1 {
	public static void main(String[] args) {
		//Array : 저장 공간 크기가 고정적
		String[] array = new String[] {"A","B","C","D","E","F"};
		System.out.println(array.length); //6
		array[2] = null;
		array[5] = null;
		System.out.println(array.length); //6
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		//List : 저장 공간 크기가 유동적. 처음 저장 공간 크기가 0
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //0
		aList.add("A"); aList.add("B"); aList.add("C"); aList.add("D");
		System.out.println(aList.size()); //4
		aList.remove("A");
		System.out.println(aList.size()); //3
		System.out.println(aList);
 		
	}

}
