package chap06_array;

public class _02_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		//num은 1씩 증가하면서 3의 배수인지 검사될 정수
		int num = 1;
		//nums의 인덱스와 인자의 개수를 세어줌.
		int count = 0;
		
		//nums 배열에 3의 배수로 10개 채우기
		while(count < 10) {
			//1부터 3의 배수인지 검사
			//1, 2, 3, 4, 5, 6...
			num++;
			
			if(num % 3 == 0) {
				//count는 num이 3의 배수가 됐을 때만 1씩 증가
				//count = 0, num = 3
				//count = 1, num = 6
				//count = 2, num = 9
				//...
				//count = 9, num = 30
				nums[count++] = num;
			}
		
		}
	  for(int i = 0; i < nums.length; i++) {
		  System.out.println(nums[i]);
	  }
	System.out.println("----------------------");
	  //배열의 역순 출력하기(인덱스 9 ~ 0)
	  //배열의 length는 항상 마지막 인덱스 + 1
	for(int i = nums.length - 1; i >= 0; i--) {
		System.out.println(nums[i]);
	}
	
	
	}

}
