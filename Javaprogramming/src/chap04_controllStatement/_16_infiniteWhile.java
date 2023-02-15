package chap04_controllStatement;

import java.io.IOException;

public class _16_infiniteWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = 0;
		while(true) {
			System.out.print("영문자 하나 입력 : ");
			num = System.in.read();
			//값을 입력할 때 전달하기 위해 누를 enter가 함께 들어오기 때문에
			//enter 값을 제거해주는 skip사용(enter는 2byte를 먹기 때문에
			//괄호안에 2명시해줌
			System.in.skip(2);
			
			System.out.println((char)num++);
			
			
			if((char)num == 'q' || (char)num == 'Q')
				break;
			
		}
		
	}

}
