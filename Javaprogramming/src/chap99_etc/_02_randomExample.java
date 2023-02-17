package chap99_etc;

import java.util.Scanner;

public class _02_randomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컴퓨터는 1 ~ 3까지의 랜덤생성 
		int randomVal = (int)(Math.random() *  3) + 1;
		
		
		//사용자가 1 ~ 3까지의 입력
		System.out.println(" 1 ~ 3까지의 숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();
		//사용자가 입력한 값이 컴퓨터가 생성한 랜덤 값과 같으면 
		//"맞췄습니다." 출력
		//아니면 "틀렸습니다." 출력
		
		if(userNum == randomVal) {
			System.out.println(randomVal + ", " + userNum);
			System.out.println("맞췃습니다");
		}else {
			System.out.println(randomVal + ", " + userNum);
			System.out.println("틀렸습니다.");
		}
		
		
		
		
	
		
		
		
		
		
	}

}
