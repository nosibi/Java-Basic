package datatype_ex03;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		//변수의 생존 기간은 {} 중괄호를 만나면 메모리에서 삭제
		int value1 = 3; // value1 생성 시점
		
		
		{
			int value2 = 5; // value2 생성 시점
			System.out.println(value1);
			System.out.println(value2);
		} // value2 소멸 시점
		
		
		System.out.println(value1);
		// System.out.println(value2); //컴파일 오류
	} // value1 소멸 시점

}
