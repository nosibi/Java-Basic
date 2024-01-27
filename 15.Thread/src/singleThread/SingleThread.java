package singleThread;

/*Thread 는 메모리의 최소 단위
 *Thread -> Process -> Memory : CPU를 사용
 *비디오 프레임과 자막을 출력하는 예시
 */

public class SingleThread {
	public static void main(String[] args) {
		// 비디오 프레임
		int [] intArray = {1,2,3,4,5};
		
		// 자막 번호
		String [] strArray = {"하나","둘","셋","넷","다섯"};
		
		// 비디오 프레임 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("비디오 프레임 " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {} // 0.2초 단위로 반복문 출력
		}
		
		// 자막 프레임 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("자막 번호 " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {} // 0.2초 단위로 반복문 출력
		}
	}

}
/*비디오 프레임과 자막이 동시에 나와야 하지만 단일 쓰레드로 실행을 하면 비디오 프레임 출력이 종료된 후 자막이 나온다
 *이러한 문제를 해결하기 위해서는 멀티 쓰레드를 이용해야한다
 */ 
