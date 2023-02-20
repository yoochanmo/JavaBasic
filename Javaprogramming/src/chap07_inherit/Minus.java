package chap07_inherit;

//인터페이스를 상속받은 자식클래스에는 인터페이스에 선언한
//모든 추상메소드가 구현되어 있어야 한다.
public class Minus implements Calculator {
	//인터페이스에 선언된 추상메소드와 완전 동일한 형태로
	//메소드를 구현해야한다. 리턴 타입, 매개변수의 타입과 개수
	public void calc(int a, int b) {
		System.out.println(a - b);
	}
}
