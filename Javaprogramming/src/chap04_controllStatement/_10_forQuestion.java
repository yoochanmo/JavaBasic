package chap04_controllStatement;

import java.io.IOException;

public class _10_forQuestion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 영문자 하나 입력받기
		
		//2. 영문자가 대문자인지 소문자인지 아니면 영문자가 아닌지 
		//if else if else로 판별
		System.out.print("영문자를 입력하세요. : ");
		int asciiCode = System.in.read();
		if(asciiCode >= 65 && asciiCode <= 90) {
			for(int i = asciiCode; i <= 90; i++)
				System.out.println((char)i);
			//for문으로 입력한 영문자부터 대문자면 대문자 Z까지 출력
			//소문자면 소문자 z까지 출력
		} else if(asciiCode >= 97 && asciiCode <= 122) {
			//if가 대문자일 때 소문자
			//if가 소문자일 때 대문자
			//입력되는 영문자에 따라 i의 초기 값이 계속 변경되도록 설정
			for(int i = asciiCode; i <= 122; i++)
				System.out.println((char)i);
		}else {
			//잘못 입력하셨습니다. 출력
			System.out.println("잘못 입력하셨습니다.");
		}
	}}
