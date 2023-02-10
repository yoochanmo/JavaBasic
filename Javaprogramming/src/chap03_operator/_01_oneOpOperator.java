package chap03_operator;

public class _01_oneOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println("--------------------------");
		
		//2-1. 증감연산자의 전위연산 
		int num2 = 10;
		
		System.out.println(++num2);
		System.out.println(--num2);
		System.out.println("---------------------------");
		
		//2-2. 증감연산자의 후위연산자
		int num3 = 10;
		
		System.out.println(num3++);
		System.out.println(num3--);
		System.out.println("----------------------------");
		
		//3. 전위연산자 후위연산자 혼합
		int num4  = 10;
		
		System.out.println(++num4); //11
		System.out.println(num4++); //11 출력 후 12대입
		
		System.out.println(--num4); //12에서 -1한 11출력
		System.out.println(num4--); //11출력 후 -1한 10대입
	}

}
