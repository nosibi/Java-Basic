package ClassInnerFactor_07;

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		int a = 3;
		
		int result1 = twice(3);
		System.out.println(result1); // 6
		
		int result2 = twice(a);
		System.out.println(result2); // 6
		
		System.out.println(a); // 3 //실제 값을 전달했기 때문에 값이 변경되지 않는다
	}
	
	public static int twice(int a) {
		a = a * 2;
		return a;
	}

}
