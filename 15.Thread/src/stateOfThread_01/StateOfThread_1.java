package stateOfThread_01;

/*쓰레드의 상태는 객체 생성, 실행, 종료순으로 진행
 *NEW(객체 생성) : Thread myThread = new MyThread();
 *myThread.start() 이후 RUNNABLE로 넘어감
 *RUNNABLE(실행) : TIMED_WAITING, BLOCKED, WAITING
 *TERMINATED(종료)
 */

public class StateOfThread_1 {
	public static void main(String[] args) {
		Thread.State state;
		
		//1.객체 생성
		Thread myThread = new Thread() {
			public void run() {
				for(long i = 0; i < 10000000000L; i++) {}
			}
		};
		
		state = myThread.getState(); //쓰레드 상태 확인
		System.out.println(state);
		
		//2.실행
		myThread.start(); //NEW -> RUNNABLE
		state = myThread.getState(); //쓰레드 상태 확인
		System.out.println(state);
		
		//3.종료
		try {
			myThread.join();
		}
		catch(InterruptedException e) {}
		state = myThread.getState(); //쓰레드 상태 확인
		System.out.println(state);
	}

}
