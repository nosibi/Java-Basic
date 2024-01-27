package stateOfThread_03;

/*join()을 이용한 TIMED_WAITING
 */
class MyThread1 extends Thread{
	public void run() {
		for(long i = 0; i < 1000000000L; i++) {}
	}
}

class MyThread2 extends Thread{
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	public void run() {
		try {
			myThread1.join(3000);
		}
		catch(InterruptedException e) {
			System.out.println("interrupt() 호출");
			for(long i = 0; i < 1000000000L; i++) {}
		}
	}
}

public class StateOfThread_3 {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread1 state = " + myThread1.getState());
		System.out.println("MyThread2 state = " + myThread2.getState());
		
		myThread2.interrupt();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread1 state = " + myThread1.getState());
		System.out.println("MyThread1 state = " + myThread2.getState());
	}

}
