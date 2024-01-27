package stateOfThread_05;
/*WAITING
 *시간 지정 없이 .join() 호출 시 조인된 쓰레드가 완료되거나 interrupt()가 호출 시에만 RUNNABLE상태로 돌아감
 *wait() 메서드를 이용하면 WAITING상태로 전환되어 notify() 또는 notifyAll()이 호출되어야 RUNNABLE상태로 돌아간다
 *wait(), notify(), notifyAll()메서드는 동기화된 블록에서만 사용가능
 *아래 예제에서 입출력 메서드를 동기화시켰기 때문에 동시에 발생되지 않는다
 *하지만,순서 또한 Key를 먼저 얻기 위한 경쟁에서 승리한 쓰레드 우선적으로 실행되기 때문에 랜덤
 */


class DataBox{
	int data;
	synchronized void inputdata(int data) {
		this.data = data;
		System.out.println("입력데이터 : " + data);
	}
	synchronized void outputdata() {
		System.out.println("출력데이터 : " + data);
	}
}

public class StateOfThread_5 {
	public static void main(String[] args) {
		DataBox databox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 9; i++) {
					databox.inputdata(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 9; i++) {
					databox.outputdata();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
