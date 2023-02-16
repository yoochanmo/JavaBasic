package chap05_class.example;

public class Singleton {
	//클래스(자기자신)를 객체화함
	//static이어서 인스턴스화 하기 전에 메모리에 Singleton 객체가 하나 생성된다.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	
	}
	//클래스 안에서 생성한 Singleton 객체를 어디서든지 참조할 수 있는 메소드
	//static 선언된 이유는 다시 singleton 객체를 만들지 않고 생성되어 있는
	//Singleton 객체를 사용하기 위해
	//다른 클래스에서 Singleton 객체를 생성하지 않고 호출가능한 함수
	public static Singleton getInstance() {
		//위에서 static으로 선언된 이미 메모리에 생성된 Singleton 객체를 리턴
		return singleton;
	}
}
