package multiThread_02;

/*package multiThread_01과 동일한 기능 구현
 *3개의 쓰레드 사용 
 */
class Subtitle extends Thread{
	public void run() {
	String [] strArray = {"하나","둘","셋","넷","다섯"};
	try {
		Thread.sleep(10);
	}
	catch(InterruptedException e) {
	}
	
	for(int i = 0; i < strArray.length; i++) {
		System.out.println("자막번호 " + strArray[i]);
		try {Thread.sleep(200);}catch(InterruptedException e) {}
	}
	}
}

class Video extends Thread{
	public void run() {
	int [] intArray = {1,2,3,4,5};
	for(int i = 0; i < intArray.length; i++) {
		System.out.println("비디오 프레임 " + intArray[i]);
		try {Thread.sleep(200);} catch(InterruptedException e) {}
	}
	}
}

public class MultiThread_2 {
	public static void main(String[] args) {
		// 객체 생성 및 실행
		Thread Subtitle = new Subtitle();
		Subtitle.start();
		
		Thread Video = new Video();
		Video.start();		
	}

}
