package ClassInnerFactor_06;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		m1(array); //객체의 위치값을 가리키므로 m1 메서드에서 변경된 값은 main에도 적용
		
		System.out.println(Arrays.toString(array)); //[8,9,10] 출력
	}
	
	public static void m1(int[] a) {
		a[0] = 8;
		a[1] = 9;
		a[2] = 10;
		
		return;
	}

}
/*입력매개변수가 참조자료형일 경우 객체의 위치값이 전달된다
 *호출된 메서드에서 객체의 값을 변경한 후 호출한 메서드(main)으로 돌아오면 값이 변경된다
 *반대로, 입력매개변수가 기본자료형일 경우 실제값이 전달된다
 *전달받은 메서드는 이 값을 복사해서 사용하므로 객체의 값이 변경되어도 호출한 메서드에서는 값이 변경되지 않는다
 * */