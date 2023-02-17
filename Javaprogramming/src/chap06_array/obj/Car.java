package chap06_array.obj;

public class Car {
	private String company;
	private String model;
	private String color;
	private int price;
	
	//기본 생성자
	public Car() {}
	
	//모든 멤버변수를 받는 생성자
	public Car(String company, String model, String color, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	//생성된 차의 정보 출력하는 메소드
	public void carInfo( ) {
		System.out.println("제조사 " + company);
		System.out.println("모델 " + model);
		System.out.println("색상 " + color);
		System.out.println("가격 " + price);
		System.out.println("--------------------------");
	}



}
