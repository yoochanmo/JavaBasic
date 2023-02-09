package chap02_variables;

public class _02_var_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var str1 = "hello";
		
		System.out.println(str1);
		//변수의 클래스 확인(원시타입 변수는 사용할 수 없음)
		System.out.println(str1.getClass().getName());
		System.out.println("---------------------------");
		
		var num1 = 100;
		
		System.out.println(num1);
		//원시타입은 wrapper 클래스로 변환 후 클래스 확인 가능
		//원시타입에는 각각 wrapper 클래스가 존재한다.
		//int => Integer, long => Long, byte => Byte....
		System.out.println(((Object)num1).getClass().getName());
		System.out.println("------------------------------------");
		
		var num2 = 12.25;
		
		System.out.println(num2);
		//원시타입은 wrapper 클래스로 변환 후 클래스 확인 가능
		//원시타입에는 각각 wrapper 클래스가 존재한다.
		//int => Integer, long => Long, byte => Byte....
		System.out.println(((Object)num2).getClass().getName());
		System.out.println("------------------------------------");
		
		

	}

}
