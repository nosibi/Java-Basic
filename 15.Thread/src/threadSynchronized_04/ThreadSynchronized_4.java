package threadSynchronized_04;

/*블록 동기화의 소괄호 안에는 어떤 객체가 와도 무방
 *메서드 동기화하는 경우 this 객체의 key만을 사용
 *동일한 key를 사용하는 경우 쓰레드의 동시 사용이 불가
 *서로 다른 key를 사용하는 경우에는 동시 사용이 가능
 *이번 예제는 3개의 쓰레드가 같은 this key를 사용하는 경우 
 */

class MyData{
	synchronized void a() {
		for(int i = 0; i < 3; i++) {
			System.out.println("a의 " + i + "번째");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
	
	synchronized void b() {
		for(int i = 0; i < 3; i++) {
			System.out.println("b의 " + i + "번째");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
	
	void c() {
		synchronized(this) {
			for(int i = 0; i < 3; i++) {
				System.out.println("c의 " + i + "번째");
				try {Thread.sleep(1000);}catch(InterruptedException e) {}
			}
		}
	}
}

public class ThreadSynchronized_4 {
	public static void main(String[] args) {
		MyData mydata = new MyData();
		new Thread() {
			public void run() {
				mydata.a();
			}
		}.start();
		
		new Thread() {
			public void run() {
				mydata.b();
			}
		}.start();
		
		new Thread() {
			public void run() {
				mydata.c();
			}
		}.start();
	}

}
/*동일한 key를 사용하기 때문에 쓰레드가 종료될때까지 다른 쓰레드가 실행되지 못함
 *메서드 c가 b보다 먼저 실행되었는데 코드 순서가 먼저 실행되었다고 해서 쓰레드 실행이 반드시 먼저되는 것은 아님
 */
