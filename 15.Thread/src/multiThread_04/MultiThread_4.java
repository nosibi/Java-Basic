package multiThread_04;

/*package multiThread_03과 동일한 기능 구현
 *쓰레드 3개 활용
 */

class Subtitle implements Runnable{
	public void run() {
		String [] strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(50);} catch(InterruptedException e) {}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("자막 번호 " + strArray[i]);
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
		}
	}
}

class Video implements Runnable{
	public void run() {
		int [] intArray = {1,2,3,4,5};
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("비디오 프레임 " + intArray[i] + " - ");
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
	    }
	}
}

public class MultiThread_4 {
	public static void main(String[] args) {
		Runnable subtitle = new Subtitle();
		Thread thread1 = new Thread(subtitle);
		
		Runnable video = new Video();
		Thread thread2 = new Thread(video);
		
		
		thread2.start();
		thread1.start();
	}

}
