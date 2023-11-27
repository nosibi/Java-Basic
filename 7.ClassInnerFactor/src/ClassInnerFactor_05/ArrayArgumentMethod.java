package ClassInnerFactor_05;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		//배열을 입력매개변수로 하는 메서드 호출
		printArray(new int[] {1,2,3});
		//printArray({1,2,3}); //오류발생. 선언과 대입이 분리 불가능
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
