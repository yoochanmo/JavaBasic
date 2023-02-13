package chap04_controllStatement;

public class _06_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'C';
		
		
		switch(grade) {
		case 'A' :
			System.out.println("시험결과는 90점 이상입니다.");
			break;
		case 'B' :
			System.out.println("시험결과는 80점 이상 90점 미만입니다.");
			break;
		case 'C' :
			System.out.println("시험결과는 70점 이상 80점 미만입니다.");
			break;
		default : 
			System.out.println("시험결과는 70점 미만입니다.");
		}
	}

}
