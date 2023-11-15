package Reference_08;

public class NonRectangleArray {
	public static void main(String[] args) {
		//비정방 행렬의 선언 및 값 대입
		//방법1
		int[][] array1 = new int[2][];
		array1[0] = new int[2];
		array1[0][0] = 1;
		array1[0][1] = 2;
		
		array1[1] = new int[3];
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.println(array1[0][0] + " " + array1[0][1]);
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println();
		
		//방법2
		int[][] array2 = new int[2][];
		array2[0] = new int[] {1,2};
		array2[1] = new int[] {3,4,5};
		
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		//방법3
		int[][] array3 = new int[][] {{1,2},{3,4,5}}; // 선언과 대입 분리 가능
		
		System.out.println(array3[0][0] + " " + array3[0][1]);
		System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
		System.out.println();
		
		//방법4
		int[][] array4 = {{1,2},{3,4,5}}; // 선언과 대입 분리 불가
		
		System.out.println(array4[0][0] + " " + array4[0][1]);
		System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
		System.out.println();
	}

}
