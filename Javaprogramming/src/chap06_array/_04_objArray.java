package chap06_array;

import chap06_array.obj.Car;

public class _04_objArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 배열의 선언
		Car[] carArr = new Car[3];
		
		//초기화 안된 상태의 배열 인자의 값
		for(int i = 0; i < 3; i++) {
			//초기화가 되었으면 주소값이 츨력돼야한다.
			//Car 객체가 인스턴스화 되지 않아서 주소값이 없다.
			System.out.println(carArr[i]);
		}
		
		//2. 객체 배열의 초기화
		//객체 배열의 초기화는 생성자를 통한 인스턴스화(객체화)가 필요화
		carArr[0] = new Car("기아", "K9", "검정", 4000);
		carArr[1] = new Car("현대", "아반떼", "흰", 2000);
		carArr[2] = new Car("제네시스", "G80", "빨강", 5000);
		
		for(int i = 0; i <carArr.length; i++) {
			System.out.println(carArr[i]);
			carArr[i].carInfo();
		}
		
		Car[] carArr2 = new Car[3];
		//3. 반복문을 통한 객체 배열의 초기화
		for(int i = 0; i < carArr.length; i++) {
			carArr2[i] = new Car();
			//car클래스의 멤버변수가 private로 선언되어서 getter나 setter 없이는 값의 변경이나 값의 확인 불가능
			System.out.println(carArr2[i]);
		}
	
	
	}

}
