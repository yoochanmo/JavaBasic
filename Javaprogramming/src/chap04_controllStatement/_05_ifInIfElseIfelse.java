package chap04_controllStatement;

import java.io.IOException;

public class _05_ifInIfElseIfelse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("영문자 대문자 한 개를 입력하세요 : ");
		int inputNum = System.in.read();
		
		if(inputNum >= 65 && inputNum <=90) {
			//중첩 조건문은 조건을 좀 더 상세하게 처리하기 위해서 주로 사용
			if((char)inputNum == 'Q') {
				System.out.println("종료되었습니다. ");
			} else {
				System.out.println("입력된 값은 : " + (char)inputNum);
			}
		}    else {
			System.out.println("잘못 입력하셨습니다. ");
		}
		
		
			
		
		
	}

}
