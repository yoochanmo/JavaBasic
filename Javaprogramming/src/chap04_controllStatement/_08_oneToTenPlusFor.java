package chap04_controllStatement;

public class _08_oneToTenPlusFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		/*for(int i = 1; i <= 10; i++) {
			//i가 10일 때 마지막으로 코드가 반복되고
			//다시 증감식으로 가서 i가 11이 되는 순간 조건에 충족되지 않기 때문에
			//for문 종료
			sum += i;
			System.out.println("현재 i의 값 : " + i);
			System.out.println("현재 sum의 값 : " + sum);
			
		}
		 */
		 int i;
		 for(i = 1; i <= 10; i++) {
				//i가 10일 때 마지막으로 코드가 반복되고
				//다시 증감식으로 가서 i가 11이 되는 순간 조건에 충족되지 않기 때문에
				//for문 종료
				sum += i;
				System.out.println("현재 i의 값 : " + i);
				System.out.println("현재 sum의 값 : " + sum);
		 }
			System.out.println("마지막 i의 값 :" + i);
			 System.out.println("1~10까지의 합 : " + sum);
	}

}
