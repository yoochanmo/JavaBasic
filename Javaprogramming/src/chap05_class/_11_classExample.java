package chap05_class;

import java.util.Scanner;

import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//scanner는 mString 값을 받아준다.
		//String 비교는 equals메소드를 사용한다.ㅣ
		//String은 jdk에서 제공하는 기본 클래스를 사용하기 때문에
		// == 비교할 시 객체의 동일성(주소 값)을 비교한다.
		//String의 값이 같은 지 비교할 때는 equals를 사용한다.
		
		System.out.println("변환할 거리를 입력해주세요(정수, m단위) : " );
		long distance = sc.nextLong();
		
		System.out.println("변환할 단위를 입력해주세요.(cm, mm, km, inch) ");
		String unit = sc.next();
		
		//객체생성
		DistanceChanger dc = new DistanceChanger(distance, unit);
		//변환된 단위로 출력
		dc.change();
	
	
	
	}	

}
