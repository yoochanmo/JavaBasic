package chap02_variables;

public class _06_operationTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 바이트가 큰 자료형과 바이트가 작은 자료형의 연산
		long longVal = 10000L;
		int intVal = 200;
		
		//intVal이 자동으로 long으로 형변환 후 연산
		long result = longVal + intVal;
		
		System.out.println(result);
		System.out.println("---------------------");
		
		//2. 바이트가 작은 자료형으로 형변환 후 연산하고 싶을 때는 명시적 형변환 사용
		int intresult = (int)longVal + intVal;
		
		System.out.println(intresult);
		System.out.println("---------------------");
		
		//3. 문자열 결합연산자에서의 형변환
		String strVal = "hello ";
		
		//int형인 intVal이 문자열(String)으로 형변환된 후
		//문자열 결합 연산이 된다.
		System.out.println(strVal + intVal);
	}

}
