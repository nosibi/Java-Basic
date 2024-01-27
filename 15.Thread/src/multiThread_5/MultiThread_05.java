package multiThread_5;

/*package multiThread_03과 동일한 기능 구현
 *익명 이너 클래스를 사용
 *익명 이너 클래스를 이용하여 생성한 Runnable 객체를 Thread 에 넘긴다
 */

public class MultiThread_05 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				String [] strArray = {"하나","둘","셋","넷","다섯"};
				try {Thread.sleep(50);} catch(InterruptedException e) {}
				
				for(int i = 0; i < strArray.length; i++) {
					System.out.println("자막 번호 " + strArray[i]);
					try {Thread.sleep(2000);} catch(InterruptedException e) {}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				int [] intArray = {1,2,3,4,5};
				for(int i = 0; i < intArray.length; i++) {
					System.out.print("비디오 프레임 " + intArray[i] + " - ");
					try {Thread.sleep(2000);} catch(InterruptedException e) {}
			    }
			}
		});
		
		thread1.start();
		thread2.start();

	}
}
