package Reference_05;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] array = new int[] {3,4,5,6,7};
		
		// 배열의 길이 구하기
		System.out.println(array.length);
		
		System.out.println();
		
		// 출력방법1
		System.out.println("출력방법 1");
		
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		
		System.out.println();
		
		// 출력방법2(for문 이용)
		System.out.println("출력방법 2");

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
		// 출력방법3(for - each문 사용)
		System.out.println("출력방법 3");

		for(int k : array) {
			System.out.println(k + " ");
		}
		System.out.println();
		
		// 출력방법4(ArraystoString)
		System.out.println("출력방법 4");
		
		System.out.println(Arrays.toString(array));
		
		
	}

}
