package multiThread_01;

/*비디오 프레임과 자막을 동시에 출력하기 위해 멀티 쓰레드를 사용
 *멀티 쓰레드를 사용하지 않을 시 각 작업은 순차적으로 처리된다
 *단일 쓰레드로 비디오, 자막을 출력하였을 때 비디오 출력 종료 후 자막이 나오는 것이 그 이유
 *멀티 쓰레드를 사용할 시 동시성과 병렬성을 가지고 작업이 처리된다
 *동시성(작업 수 > 코어 수) : 매우 짧은 간격으로 교차 실행. 사용자 입장에서는 두 작업이 동시에 처리되는 것으로 보임
 *병렬성(작업 수 < 코어 수) : 각각 코어에서 실행 
 *2개의 쓰레드를 활용(SMFileThread, main Thread)
 *쓰레드의 생성과 실행에는 2가지가 있다.
 *방법1. Thread 클래스를 상속받아 run()메서드를 재정의
 *방법2. Runnable 인터페이스 구현 객체를 생성한 후 Thread 생성자로 Runnable 객체 전달
 */


//방법1
class SMFileThread extends Thread{
	public void run() {
		//자막 번호
		String [] strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch(InterruptedException e) {} //자막 번호가 비디오 프레임 뒤에 나오도록 0.01초 늦게 출력
		//자막 번호 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("자막 번호 " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class MultiThread_1 {
	public static void main(String[] args) {
		//SMFileThread 객체 생성
		SMFileThread smt = new SMFileThread();
		smt.start();
		
		//비디오 프레임 번호
		int [] intArray = {1,2,3,4,5};
		
		//비디오 프레임 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("비디오 프레임 " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}

}
