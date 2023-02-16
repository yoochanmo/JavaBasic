package chap05_class.calc;

public class Calculator {
	//사용자 입력 값을 받아줄 멤버변수(정수1, 정수2, 연산자)
	private int num1;
	private int num2;
	private String op;
	
	
	public Calculator() {
		
		
	}
	//멤버변수를 사용자가 입력한 값으로 초기화하기 위한 생성자
	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	//사용자가 입력한 값(정수1, 정수2)으로 사칙연산하는 메소드 4개
	public int add() {
		return num1 + num2;
	}
	public int minus() {
		return num1 - num2;
	}

	public long multiple() {
		return num1 * num2;
	}

	public double divide() {
		return (double)num1 / num2;
	}
	// 사칙연산된 결과를 출력해주는 메소드
	public void calc() {
		//결과를 출력해주는 메소드
		//사용자가 입력한 연산자(op)에 값에 따라서 조건처리
		switch(op) {
			//op = "+"면 더한 결과를 출력하기 위해 add메소드 호출
		case "+" :
				System.out.println(num1 + " " + op + " " + num2 + " = " + add());
			break;
			//op = "/"면 두 정수의 나눈 값의 결과를 출력하기 위해서 divide 메소드 호출
		case "/" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + divide());
			break;
			//op = "-"면 두 정수를 뺀 결과를 출력하기 위해서 minus메소드 호출
		case "-" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + minus());
			break;
			//op = "*"면 두 정수의 곱한 결과를 출력하기 위해 multiple메소드 호출
		case "*" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + multiple());
			break;
		
		
		
		
		}
	}
	
	
	
}

