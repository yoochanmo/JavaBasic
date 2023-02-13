package chap03_operator;

import java.io.IOException;

public class _04_homework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("영문자 하나를 입력하세요. : ");
		int asciiCode = System.in.read();
		
		//1. 영문자의 대문자, 소문자 판단하기
		System.out.println(asciiCode >= 65 && asciiCode <= 90 ? "대문자입니다." : asciiCode >= 97 && asciiCode <=122 ? "소문자입니다." : "잘 못 입력하셨습니다."); 
		System.out.println("--------------------------------------");
		
		//2. 영문자 대문자는 소문자로, 소문자는 대문자로 출력하기
		
		System.out.print("영문자 : ");
		
		System.out.println(asciiCode >= 65 && asciiCode <= 90 ? (char)(asciiCode + 32) : asciiCode >= 97 && asciiCode <=122 ? (char)(asciiCode - 32)  : "잘 못 입력하셨습니다."); 
		
		
		
	}

}
