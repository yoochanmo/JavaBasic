package chap04_controllStatement;

public class _14_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문에서의 continue
		for(int i = 0; i < 10; i++) {
			//i가 6일때 증감식으로 돌아가서 i가 7로 변경된다.
			if(i==6) {
				continue;
			}
			System.out.println(i);
		} 	System.out.println("------------------------");
		
		//2. while문에서의 continue
		int num = -1;
		while (++num < 10) {
			if(num == 6) {
				continue;
			}
			System.out.println(num);
		}
		
		
	}

}
