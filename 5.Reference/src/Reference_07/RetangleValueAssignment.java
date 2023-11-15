package Reference_07;

import java.util.Arrays;

public class RetangleValueAssignment {
	public static void main(String[] args) {
		//배열 객체 생성 및 원소 값 대입
		//방법1
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array1[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] array2;
		array2 = new int[2][3];
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[0][2] = 13;
		array2[1][0] = 14;
		array2[1][1] = 15;
		array2[1][2] = 16;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array2[i][j]);
			}
		}
		
		System.out.println();
		
		//방법2
		int[][] array3 = new int[][] {{21,22,23},{24,25,26}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array3[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] array4;
		array4 = new int[][] {{31,32,33},{34,35,36}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array4[i][j]);
			}
		}
		
		System.out.println();
		
		//방법3
		int[][] array5 = {{41,42,43},{44,45,46}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array5[i][j]);
			}
		}
		
		//int[][] array6;
		//array6 = {{51,52,53},{54,55,56}}; //불가능(선언과 대입의 분리가 안됨)
	}

}
