package chap02_variables;

public class _04_autoTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 바이트가 작은 단위에서 큰 단위로 자동 형변환
		byte byteVal = 10;
		char chVal = 'A';
		int intVal = byteVal;
		
		System.out.println(intVal);
		System.out.println("-------------------------");
		
		intVal = chVal;
		System.out.println(intVal);
		System.out.println("-------------------------");
		
		//2. 좀 더 세밀하게 표현범위가 넓은 자료형으로 자동 형변환
		long longVal = 100000L;
		float floatVal = longVal;
		
		System.out.println(floatVal);
		System.out.println("--------------------------");
		
		floatVal = intVal;
		System.out.println(floatVal);
		System.out.println("--------------------------");
		
	}

}
