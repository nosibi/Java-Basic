package stackCollectionClass;
import java.util.Stack;
/*Stack<E> Class
 *Last In Fist Out(후입선출)
 *Vector<E>의 자식 클래스
 *LIFO 구조를 위한 5개의 메서드를 사용하기 위해서는 Stack<E>타입으로 선언해야 함ㅁ
 */

public class StackCollectionClass {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//1. push(E element) : 데이터 입력
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		//2. peak() : 가장 상위에 있는 원소값 리턴(데이터에는 변화가 없음)
		System.out.println(stack.peek()); //후입선출의 구조를 알 수 있음
		System.out.println(stack.size()); //데이터 개수에 변화가 없음. peek()메서드로 인한 데이터 변화가 없음
		System.out.println();
		//3. search(Object o) : 데이터 검색. 가장 상위의 값은 1, 아래로 내려갈수록 1씩 추가, 데이터가 없을 경우 -1 리턴 
		System.out.println(stack.search(7)); //데이터가 존재하지 않아 -1 리턴
		System.out.println(stack.search(4));
		System.out.println();
		//4. pop() : 최상위 데이터 꺼내기(데이터 개수 감소)
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); //출력 데이터가 감소하는 것을 알 수 있음
		System.out.println(stack.toString());
		//5. empty() : Stack<E>의 객체가 비어있는지 유무
		System.out.println(stack.empty());
	}

}
