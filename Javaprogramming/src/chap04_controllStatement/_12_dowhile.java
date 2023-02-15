package chap04_controllStatement;

public class _12_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		
		do {
			sum += num;
			System.out.println(num++ + "회 실행");
		} while(num > 100);
		
		int cnt = 1;
		
		do {
			System.out.println("Java Study" + cnt++);
		}while(cnt <= 10);
	
	}

}
