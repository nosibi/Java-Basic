package listCollectionInterface_02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollectionInterface_2 {
	public static void main(String[] args) {
		//1.List 구현 클래스의 생성자를 이용하여 객체 생성
		List<Integer> aList1 = new ArrayList<>(); //기본생성자이므로 저장용량은 10으로 설정됨
		List<Integer> aList2 = new ArrayList<>(30); //생성자 매개변수에 capacity(저장용량)을 설정가능
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new LinkedList<>(); //LinkedList는 capacity 지정 불가
		
		//2.Arrays 클래스의 정적 메서드 활용
		List<Integer> aList5 = Arrays.asList(1,2,3,4);
		List<String> aList6 = Arrays.asList("A","B");
		aList5.set(1, 10); //데이터 변경만 가능(추가,제거는 불가능)
		//aList5.add(5);
		//aList5.remove(0);
		System.out.println(aList5);
		System.out.println(aList6);
	}
	

}
