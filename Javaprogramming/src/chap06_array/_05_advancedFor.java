package chap06_array;

import chap06_array.obj.Car;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 98, 76, 85, 65};
		int sum = 0;
		double avg;
		
		for(int s : score) {
			System.out.println(s);
			sum += s;
		}
	
		System.out.println("점수의 총합은 : " + sum);
		avg = (double)sum / score.length;
		
		System.out.println("평균 점수 : " + avg);
		System.out.println("------------------------------");
	
	
		//객체 배열의 향상된 for문
		
		Car[] carArr = new Car[3];
		
		
		
		//2. 객체 배열의 초기화
		//객체 배열의 초기화는 생성자를 통한 인스턴스화(객체화)가 필요화
		carArr[0] = new Car("기아", "K9", "검정", 4000);
		carArr[1] = new Car("현대", "아반떼", "흰", 2000);
		carArr[2] = new Car("제네시스", "G80", "빨강", 5000);
		
		for(Car c : carArr) {
			c.carInfo();
		}
	
	
	
	}

}
