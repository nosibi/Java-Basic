package stateOfThread_06;
/*이전 예제에서 입출력 순서가 랜덤인 것을 교차 실행으로 변경하기 위해 wait(),notify()메서드 사용
 *isEmpty = true 인 경우 데이터가 비어 있으므로 아직 입력 처리가 안된 것을 의미. 출력 메서드는 wait() 처리
 *isEmpty = false 인 경우 데이터가 입력되어 있으나 아직 출력 처리가 안된 것을 의미. 입력 메서드는 wait() 처리
 */

class DataBox{
	boolean isEmpty = true;
	int data;
	
	synchronized void inputdata(int data) {
		if(!isEmpty) {
			try {wait();}catch(InterruptedException e) {}
		}
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터 : " + data);
		notify(); //Thread t2 WAITING -> RUNNABLE
	}
	
	synchronized void outputdata() {
		if(isEmpty) {
			try {wait();}catch(InterruptedException e) {}
		}
		
		isEmpty = true;
		System.out.println("출력 데이터 : " + data);
		notify(); //Thread t1 WAITING -> RUNNABLE
	}
}

public class StateOfThread_6 {
	public static void main(String[] args) {
		DataBox databox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 8; i++) {
					databox.inputdata(i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 8; i++) {
					databox.outputdata();
				}
			}
		};
		t1.start();
		t2.start();
	}

}
