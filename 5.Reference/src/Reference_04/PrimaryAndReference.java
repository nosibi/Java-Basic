package Reference_04;

public class PrimaryAndReference {
	public static void main(String[] args) {
		//기본 자료형의 대입 연산
		int value1 = 3;
		int value2 = value1;
		value2 = 7; //실제 데이터 값을 복사하여 변경하였으므로 원본은 변함 없다
		System.out.println(value1);
		System.out.println(value2);
		
		System.out.println();
		
		//참조 자료형의 대입 연산
		//실제 데이터의 위치값이 복사되므로 변경할 경우 원본 데이터 값도 변경된다
		int[] value3 = new int[] {1,2,3};
		int[] value4 = value3;
		value4[0] = 0;
		System.out.println(value3[0]);
		System.out.println(value4[0]);
	}

}
