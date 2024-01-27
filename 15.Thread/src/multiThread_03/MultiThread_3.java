package multiThread_03;

/*방법2. Runnable 인터페이스 구현 객체 생성한 후 Thread 생성자로 Runnable 객체 전달
 *쓰레드 2개 사용(Subtitle, main)
 */

class Subtitle implements Runnable{
	public void run() {
		String [] strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(100);} catch(InterruptedException e) {}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("자막 번호 " + strArray[i]);
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
		}
	}
}

public class MultiThread_3 {
	public static void main(String[] args) {
		Runnable subtitle = new Subtitle();
		Thread thread = new Thread(subtitle);
		thread.start();
		
		int [] intArray = {1,2,3,4,5};
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("비디오 프레임 " + intArray[i]);
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
		}
	}

}
/*Runnable 인터페이스를 상속하여 run()메서드를 구현하는 방법은 Runnable 객체 내부에 start()메서드가 존재하지 않기 때문에 Runnable 객체를 Thread 생성자에 매개변수로 넘겨야 한다
 *따라서, 실행 시에는 Thread 객체를 호출하여 start()메서드를 사용한다
 */ 
