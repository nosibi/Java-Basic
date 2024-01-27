package threadSynchronized_02;

/*동기화에는 메서드 동기화, 블록 동기화로 분류
 *메서드 동기화 : 2개의 쓰레드가 동기에 메서드를 실행할 수 없는 것. 리턴 타입 앞에 synchronized 키워드 추가
 *접근지정자 synchronized 리턴타입 메서드명(입력매개변수){}
 */
class MyData{
	int data = 3;
	
	//메서드 동기화 시키게 되어 thread1이 종료될 때까지 thread2는 plusdata() 메서드를 실행시킬 수 없음
	public synchronized void plusdata() {
		int mydata = data;
		try {Thread.sleep(2000);}catch(InterruptedException e) {} //2초의 간격은 CPU연산 시간을 극대화하기 위한 연출
		data = mydata + 1;
	}
}

class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	public void run() {
		myData.plusdata();
		System.out.println(getName() + "실행 결과 : " + myData.data);
	}
}


public class ThreadSynchronized_2 {
	public static void main(String[] args) {
		MyData mydata = new MyData();
		
		Thread thread1 = new PlusThread(mydata);
		thread1.setName("thread1");
		thread1.start();
		
		Thread thread2 = new PlusThread(mydata);
		thread2.setName("thread2");
		thread2.start();
	}

}
