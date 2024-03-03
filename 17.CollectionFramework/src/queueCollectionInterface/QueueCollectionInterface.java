package queueCollectionInterface;
import java.util.Queue;
import java.util.LinkedList;
/*LinkedList<E>는 Queue<E>의 구현 클래스
 *Stack<E>와 반대로 Queue<E>는 FIFO(First In First Out)
 *LinkedList<E>의 특징 중 입력 정보의 순서를 저장하는 것은 Queue<E>의 특징
 *FIFO 기능이 있는 메서드로 예외 처리 기능이 있는 메서드, 예외 처리 기능이 없는 메서드 2쌍이 존재 
 */

public class QueueCollectionInterface {
	public static void main(String[] args) {
		//1.예외 처리 기능이 없는 메서드
		Queue<Integer> queue1 = new LinkedList<>();
		// 데이터 추가 add()
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		System.out.println(queue1.toString());
		// 데이터 확인 element() : 가장 상위에 있는 원솟값(가장 먼저 입력된 데이터) 리턴(데이터 변화 없음)
		System.out.println(queue1.element());
		// 데이터 추출 remove() : 가장 상위에 있는 원소값 꺼내기
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		//System.out.println(queue1.element()); //리턴 할 원소가 없어 NoSuchElementException 발생
		//System.out.println(queue1.remove());
		
		System.out.println();
		
		//2. 예외 처리 기능이 있는 메서드
		Queue<Integer> queue2 = new LinkedList<>();
		// 데이터 추가 offer()
		queue2.offer(5);
		queue2.offer(4);
		queue2.offer(3);
		queue2.offer(2);
		queue2.offer(1);
		System.out.println(queue2.toString());
		// 데이터 확인 peek()
		System.out.println(queue2.peek()); //FIFO 형식
		// 데이터 추출 poll()
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.toString());
		System.out.println(queue2.peek()); //리턴 할 원소가 없어 Null값 출력
		System.out.println(queue2.poll());
		
	}

}
/*예외 처리만 잘한다면 어떤 메서드를 사용하여도 무방
 *가능한 예외 처리 기능이 있는 메서드를 사용하는 것이 좋음
 */
