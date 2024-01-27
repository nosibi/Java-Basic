package threadSynchronized_01;

class MyData{
	int data = 3;
	
	public void plusdata() {
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

public class ThreadSynchronized_1 {
	public static void main(String[] args) {
		MyData myData = new MyData();
		Thread thread1 = new PlusThread(myData);
		thread1.setName("thread1");
		thread1.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		Thread thread2 = new PlusThread(myData);
		thread2.setName("thread2");
		thread2.start();
	}

}
