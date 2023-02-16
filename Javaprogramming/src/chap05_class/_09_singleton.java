package chap05_class;

import chap05_class.example.Course;
import chap05_class.example.Singleton;

public class _09_singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자함수를 호출하지 않았기 때문에 인스턴스화가 되지 않아서
		//메모리에 객체가 생성되지 않음.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 객체");
		}	else {
			System.out.println("s1과 s2는 다른 객체");
		}
		System.out.println("------------------------------");
		
		Course c1 = new Course();
		Course c2 = new Course();
		
		if(c1 == c2) {
			System.out.println("c1과 c2는 같은 객체");
			
		} else {
			System.out.println("c1과 c2는 다른 객체");
		}
	
	}

}
