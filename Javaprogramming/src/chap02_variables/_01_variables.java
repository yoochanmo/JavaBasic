package chap02_variables;

public class _01_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int 변수 선언 (자료형 변수명)
		//문장이 끝날 때마다 ; 필수로 입력해야됨
		int num1;
		
		//2. int 변수 초기화
		num1 = 100;
		
		//3. 변수의 사용
		System.out.println("int형 변수 출력");
		System.out.println(num1);
		System.out.println("-----------------------");
		
		//4. long 변수 선언과 초기화
		long bigNum1 = 100000000L;
		
		//5. 변수의 사용
		//syso입력 후 ctrl + space
		System.out.println("long형 변수 출력");
		System.out.println(bigNum1);
		System.out.println("------------------------");
		
		//6. short 변수의 연산
		short sNum1 = 1;
		short sNum2 = 2;
		
		//7. int로 자동 변환되는 short의 연산 결과
		//문장(문자열)은 큰 따옴표(") 사용
		System.out.println("");
		System.out.println(sNum1 + sNum2);
		System.out.println("-----------------------");
		
		//문장(문자열)은 JRE의 자바 클래스 라이브러리에 만들어놓은
		//클래스를 사용하여 생성한다.(원시타입(자료형)이 아님, 참조타입)
		
		String str = "문장(문자열)을 생성하는 클래스";
		System.out.println(str);
		
		//8. char 변수 선언과 초기화
		//char는 하나의 문자를 값으로 지정하기 때문에 작은 따옴표(') 사용
		char ch1 = 'A';
		int ch2 = 'A';
		
		//9. char 변수 사용
		System.out.println("char 변수 출력");
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
		System.out.println("-----------------------");
		
		//10. 실수형 변수 선언과 초기화
		float fNum = 3.14f;
		double dNum = 3.14;
		
		//11. 실수형 변수 사용
		System.out.println("실수형 변수 출력");
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println("-----------------------");
		
		//12. boolean 변수선언과 초기화
		boolean result1 = false;
		boolean result2 = false;
		
		int num2 = 10;
		int num3 = 11;
		
		//삼항 연산자(?의 앞의 조건이 충족하면 ? 뒤의 값, 충족하지 못하면 :뒤의 값을 선택
		//num2를 2로 나눈 나머지 값이 0이면 true 0이 아니면 false
		result1 = num2 % 2 == 0 ? true : false;
		//num3를 2로 나눈 나머지 값이 0이면 true 0이 아니면 false
		result2 = num3 % 2 == 0 ? true : false;
		
		//13. boolean 변수의 사용
		System.out.println("boolean 변수 출력");
		System.out.println(result1);
		System.out.println(result2);
	}
}
		
		