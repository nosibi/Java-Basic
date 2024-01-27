package stateOfThread_04;

/*동일한 동기화된 영역을 여러 개의 쓰레드가 동시에 실행할 경우
 *동기화 영역에 가장 먼저 도착한 순서가 t1 -> t2 -> t3
 *t1 쓰레드가 가장 먼저 동기화 영역을 실행. t2, t3는 BLOCKED 상태
 *이후 실행은 다시 가장 먼저 동기화 영역에 도착한 쓰레드가 실행
 *즉, 몇 번째로 BLOCKED 상태가 되었는지는 중요하지 않음
 */
class MyBlockTest{
	Myclass mc = new Myclass();
	Thread t1 = new Thread(){
		public void run() {
			mc.synmethod();
		}
	};
	Thread t2 = new Thread(){
		public void run() {
			mc.synmethod();
		}
	};
	Thread t3 = new Thread(){
		public void run() {
			mc.synmethod();
		}
	};
	void startall() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class Myclass{
		synchronized void synmethod() {
			try {Thread.sleep(100);}catch(InterruptedException e) {}
			System.out.println("====" + Thread.currentThread().getName() + "====");
			System.out.println("Thread1 = " + t1.getState());
			System.out.println("Thread2 = " + t2.getState());
			System.out.println("Thread3 = " + t3.getState());
		}
	}
}


public class StateOfThread_4 {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startall();
	}

}
