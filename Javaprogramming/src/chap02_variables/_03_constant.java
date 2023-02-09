package chap02_variables;

public class _03_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 상수 선언
		final int COUNT_MONTHS = 12;
		final int COUNT_DAYS_WEEK = 7;
		final double PI = 3.14;
		final int MAX_VALUE;
		
		//2. 상수 선언 후 초기화
		MAX_VALUE = 100;
		
		//3. 상수 값 변경
		//COUNT_DAYS_WEEK = 6; 값이 할당되어 있는 상태에서 변경하면 빨간줄(에러)
	
		//값이 지정되지 않은 상수는 값을 입력할 수 있지만
		//값이 지정된 상수들의 값을 변경하는 것은 불가능
		System.out.println(MAX_VALUE);
		
		System.out.println("1년은" + COUNT_MONTHS + "개월입니다.");
		System.out.println("일주일은 " + COUNT_DAYS_WEEK + "일입니다.");
		System.out.println("반지름이 2인 원의 넓이는 " + (PI * 2 * 2) + "입니다.");
		System.out.println("반지름이 3인 원의 둘레는 " + (2 * PI * 3) + "입니다.");
	}}


