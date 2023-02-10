package chap02_variables;

public class _05_forceTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 큰 단위의 값을 작은 단위의 값으로 대입할 때
		long longVal = 32770l;
		int intVal = (int)longVal;
		
		System.out.println(intVal);
		System.out.println("---------------------");
		
		short shortVal = (short)longVal;
		
		//300000이 short범위를 넘어서 -27680이 출력
		//자료형의 범위를 넘는 값이 대입되면 비트단위 연산으로 변경
		//short 2진수로 표현하면 16자리 0000 0000 0000 0000
		//음수를 표현할 수 있는 자료형에서는 2진수의
		//제일 큰 자리수가 부호를 결정(1이면 음수, 0이면 양수)
		//32767 -> 0111 1111 1111 1111
		//-32768 -> 1000 0000 0000 0000 (부호 반전)
		//32770 -> 1000 0000 0000 0010 -> 1 111 1111 1111 1101 -> -32766
		//300000 - 32768의 값이 2진수값에 1씩 계속 더해진다.
		//몇 번의 부호 반전이 발생하면서 결국 27680 값을 출력
		System.out.println(shortVal);
		System.out.println("---------------------");
		
		//2. 더 세밀한 자료형의 값을 덜 시밀한 자료형에 대입할 때
		float floatVal = 3.14f;
		intVal = (int)floatVal;
		
		System.out.println(intVal);
		System.out.println("---------------------");
		
		longVal = (long)floatVal;
		
		System.out.println(longVal);
		System.out.println("---------------------");
		
	}

}
