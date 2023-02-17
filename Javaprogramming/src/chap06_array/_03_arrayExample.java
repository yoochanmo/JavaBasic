package chap06_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = new char[26];
		
		for(int i = 0; i < chArr.length; i++) {
			char ch = 'A';
			//i = 0, chArr[0] = A
			//i = 1, chArr[1] = B
			//...
			//i = 25, chArr[25] = Z
			chArr[i] = (char)(ch + i);
		}
	
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
	System.out.println("----------------------------");
	
	
	for(int i = 0; i < chArr.length; i++) {
		char ch = 'a';
		//i = 0, chArr[0] = A
		//i = 1, chArr[1] = B
		//...
		//i = 25, chArr[25] = Z
		chArr[i] = (char)(ch + i);
	}

	for(int i = 0; i < chArr.length; i++) {
		System.out.println(chArr[i]);
		System.out.println((char)(chArr[i] + 32));
	
	
	
	}

	}}
