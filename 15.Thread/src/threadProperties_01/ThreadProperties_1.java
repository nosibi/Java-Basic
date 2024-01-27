package threadProperties_01;

//Thread 객체의 속성 다루기

public class ThreadProperties_1 {
	public static void main(String[] args) {
		// 객체 참조하기, 쓰레드의 개수 가져오기
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
		System.out.println("동작하는 쓰레드의 개수 = " + Thread.activeCount());
		
		System.out.println();
		
		// 쓰레드의 이름 자동 지정1
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
		}
		
		System.out.println();
		
		// 쓰레드의 이름 직접 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
		}
		
		System.out.println();
		
		// 쓰레드의 이름 자동 지정2
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
		}
				
			System.out.println();
		
		// 쓰레드의 개수 가져오기
		System.out.println("동작하는 쓰레드의 개수 = " + Thread.activeCount());
	}

}
