package daemonThread_01;

//쓰레드의 데몬 설정1(일반쓰레드)
/*일반적으로 쓰레드 객체 실행 시 다른 쓰레드 종료 여부와 관계 없이 자신의 쓰레드가 종료될 때까지 계속 실행
 *일반 쓰레드가 종료되면 함께 종료되는 쓰레드를 데몬 쓰레드라고 한다
 */
class MyThread extends Thread{
	public void run() {
		System.out.println(getName() + ": " + (isDaemon()? "데몬 쓰레드" : "일반 쓰레드"));
		for(int i = 0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}



public class DaemonThread_1 {
	public static void main(String[] args) {
		//일반 쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); //일반 쓰레드로 설정
		thread1.setName("thread1");
		thread1.start(); //일반 쓰레드이므로 main 쓰레드가 종료되어도 thread1은 종료될 때까지 실행
		
		//3.5초 후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main Thread 종료"); //이후 main 메서드에 코드가 없기 때문에 main 쓰레드가 종료됨
	}

}
