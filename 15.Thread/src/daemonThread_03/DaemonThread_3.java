package daemonThread_03;

class MyThread extends Thread{
	public void run() {
		System.out.println(getName() + ": " + (isDaemon()? "데몬 쓰레드" : "일반 쓰레드")); //데몬 쓰레드이면 앞의 것을, 아니면 뒤의 것을 선택
		for(int i = 0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class DaemonThread_3 {
	public static void main(String[] args) {
		//일반 쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		
		
		//데몬 쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		try {Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main 쓰레드 종료");
		
	}

}
