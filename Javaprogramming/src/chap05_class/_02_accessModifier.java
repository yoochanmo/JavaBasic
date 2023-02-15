package chap05_class;

import chap05_class.calc.Minus;

public class _02_accessModifier extends Minus{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//설계도로 부품을 만들기
		Minus m = new Minus();
		
		//접근 제어자 확인
		m.num1 = 10;//public
		//m.num2 = 10;//protected
		//m.num3 = 10;//default 같은 패키지 내에 존재하지 않으면 에러
		//m.num4 = 10;//private 같은 클래스 안에서만 사용가능
		m.minu(10, 20);//public 메소드 어디서든지 사용가능
	}

}
