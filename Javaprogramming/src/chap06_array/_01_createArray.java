package chap06_array;

public class _01_createArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열의 선언(인덱스 0~4)
		int[] numArr = new int[5];
		
		//2. 배열의 초기화
		numArr[0] = 14;
		numArr[2] = 16;
		
		//3. 배열의 사용
		System.out.println(numArr[0]);
		System.out.println(numArr[2]);
		//초기화하지 않은 값의 출력
		System.out.println(numArr[4]);
		
		System.out.println("-----------------------------------------------");
		//4. 길이가 큰 배열의 선언 (인덱스 0 ~ 999)
		int[] bigArr = new int[1000];
		
		//5. 길이가 큰 배열의 초기화
		//bigArr.length를 이용해서 배열의 길이만큼 반복되는 for문 구성
		for(int i= 0; i < bigArr.length; i++) {
			bigArr[i] = i + 1;
		}
	
		//6. 길이가 큰 배열의 사용
		System.out.println(bigArr[2]);
		for(int i= 0; i < 1000; i++) {
			System.out.println(bigArr[i]);
		}
	System.out.println("-------------------------------------------------");
		//7. 배열의 선언과 동시에 초기화
		//길이가 4(인덱스 0 ~ 3)인 배열의 선언과 동시에 값이 10, 20, 30, 40으로 초기화
		int[] valueArr = {10, 20, 30, 40} ;
	
		//8. 배열의 사용
			System.out.println(valueArr[0]);
			System.out.println(valueArr[2]);
			//인덱스의 범위를 벗어난 배열의 인자에 접근할 때
			//java.lang.ArrayIndexOutOfBoundException 예외발생
			//배열을 사용할 때는 정해진 인덱스 안의 값만 사용
			System.out.println(valueArr[5]);
		
	
	}

}
