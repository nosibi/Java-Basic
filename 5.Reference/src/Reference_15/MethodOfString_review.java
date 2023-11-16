package Reference_15;

public class MethodOfString_review {
	public static void main(String[] args) {
		/*String = "내 이름은 [홍길동]입니다.나이는 [15]살 입니다"
		 *String name -> 홍길동 , int age -> 15가 저장되도록 코드 작성 
		 단, indexOf,lastIndexOf,subString 메서드는 반드시 한 번 이상 사용*/
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		name = str.substring(str.indexOf("홍길동"),str.lastIndexOf("홍길동")+3);
		age = Integer.valueOf(str.substring(str.indexOf("15"),str.lastIndexOf("15")+2));
		System.out.println(name);
		System.out.println(age);
		
		
		
	}

}
