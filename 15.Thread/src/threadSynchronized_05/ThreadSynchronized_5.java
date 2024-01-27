package threadSynchronized_05;
/*이번 예제는 2개의 쓰레드는 this key를, 나머지 쓰레드는 Object key를 사용
 *같은 key를 사용하는 2개의 쓰레드는 동시 시행이 불가 
 *Object key를 사용하는 쓰레드는 this key를 사용하는 쓰레드의 실행과 무관하게 실행됨
 */

class MyData{
	synchronized void a() {
		for(int i = 0; i < 3; i++) {
			System.out.println("a의" + i + "번째");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
	
	synchronized void b() {
		for(int i = 0; i < 3; i++) {
			System.out.println("b의" + i + "번째");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
	
	void c() {
		synchronized(new Object()) {
			for(int i = 0; i < 3; i++) {
				System.out.println("c의" + i + "번째");
				try {Thread.sleep(1000);}catch(InterruptedException e) {}
			}
		}
	}
}

public class ThreadSynchronized_5 {
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
