package Reference_09;

public class ReadArrayData_2D {
	public static void main(String[] args) {
		//2차원 배열의 출력
		//방법1 : 이중 for 문 사용
		int[][] a = new int[][] {{1,2},{3,4,5}};
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		
		//방법2 : 이중 for-each 문 사용
		for(int[] array : a) {
			for(int k : array) {
				System.out.print(k + " ");
			}
		}
	}

}
