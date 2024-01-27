package stateOfThread_02;

/*TIMED_WAITING
 *Thread.sleep() : 이 메서드를 호출한 쓰레드를 일시정지
 *쓰레드 객체.join() : 특정 쓰레드 객체에게 일정 시간 동안 CPU 할당
 *TIMED_WAITING 상태에서 interrupt()메서드 호출 시 다시 RUNNABLE 상태가 됨 
 *Thread.sleep() 메서드를 이용한 TIME_WAITING과 interrupt()
 */

class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println("interrupt() 호출");
			for(long i = 0; i < 1000000000L; i++) {}
		}
	}
}

public class StateOfThread_2 {
	public static void main(String[] args) {
		Thread mythread1 = new MyThread();
		mythread1.start(); //실행 시 3초 시간 정지
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread state = " + mythread1.getState()); //TIMED_WAITING 상태
		
		mythread1.interrupt(); //interrupt()호출 -> RUNNABLE로 전환
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		System.out.println("MyThread state = " + mythread1.getState()); //RUNNABLE 상태
	}

}
