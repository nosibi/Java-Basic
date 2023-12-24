package AccessModifierOfClass_02;

import AccessModifierOfClass_02.pack.AA;
//import AccessModifierOfClass_02.pack.BB; //default class이므로 import 불가
import AccessModifierOfClass_02.pack.CC;


public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//객체 생성
		AA a = new AA();
		//BB b = new BB(); //default class,constructor
		//CC c = new CC(); //import는 가능하지만 생성자가 default 접근 지정자를 가지므로 객체 생성 불가
		
	}

}
