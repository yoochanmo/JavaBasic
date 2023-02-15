package chap04_controllStatement;

public class _13_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 찍기
		//1. 단이 될 for문
		for(int i =2; i <= 9; i++) {
			//2.곱하기 될 for문
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "    ");
			}
			//엔터 값으로 단이 끝난 것을 표사
			System.out.println();
		}
		System.out.println("-------------------------------------");
		//2. 별 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		//3. 삼각형 별 찍기
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j)
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		 //3.
        for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				if(i <= j)
				System.out.print("*");
			}}
        	
        //3.
        for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				if(i <= j)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
	
		
        
        
        
        
        
        }
        }
}
		
	

		
		
	


