package Reference_10;

public class CreateStringObject {
	public static void main(String[] args) {
		// String 객체 생성1
		String str1 = new String("안녕");
		System.out.println(str1);
		
		// String 객체 생성2
		String str2 = "안녕하세요"; // 리터럴을 바로 입력
		System.out.println(str2);
		
		// String 클래스의 2가지 특징
		// 1. 객체 안의 값을 변경하면 새로운 객체를 생성
		// 2. 리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유
		
	}

}
