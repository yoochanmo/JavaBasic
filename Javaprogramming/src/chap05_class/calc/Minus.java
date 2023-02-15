package chap05_class.calc;

public class Minus {
	//num3 까지는 같은 패키지내의 클래스에서는 무조건 사용가능
	//멤버변수 : 객체가 고유의 특성 -> 다른 클래스에서 접근하여 변경할 수 있으면
	//고유의 특성이 사라지는 경우가 발생 -> 멤버변수는 거의 private으로 선언한다.
	//멤버변수의 값을 사용할 때는 getter라는 메소드를 사용하여 값을 다른 클래스에 
	//가져간다.
	//private 멤벼변수의 값을 변경할 때는 setter 메소드를 사용하여 변경한다.
	public int num1;
	

	protected int num2;
	int num3;
	//num4는 Minus클래스에서만 사용가능
	private int num4;
	
	public int minu(int a, int b) {
		return a - b;
	}
	public int getNum4() {
		return num4;
	}
	
	//private 멤버변수의 값을 변경하는 setter 메소드
	public void setNum4(int num4) {
		//this는 이 객체를 의미(Minus 객체를 가리킴)
		this.num4 = num4;
	}
	
	}






