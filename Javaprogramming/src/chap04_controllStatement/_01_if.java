package chap04_controllStatement;

import java.io.IOException;

public class _01_if {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 입력받은 영문자의 대소문자 판별
		System.out.print("영문자 하나를 입력하세요. : ");
		int asciiCode = System.in.read();
		
		if(asciiCode >=65 && asciiCode <=90)
			System.out.println("대문자입니다. ");
		
		if(asciiCode >= 97 && asciiCode <= 122)
			System.out.println("소문자입니다.");
		
		//산술 -> 관계 -> 논리
		if(asciiCode < 65 || (asciiCode > 90 && asciiCode < 97) || asciiCode > 122)
			System.out.println("잘못입력하셨습니다. ");
		
	}

}
