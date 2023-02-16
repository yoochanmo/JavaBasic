package chap05_class;

import java.util.Scanner;

import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
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
