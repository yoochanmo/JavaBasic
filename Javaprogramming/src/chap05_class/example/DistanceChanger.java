package chap05_class.example;

public class DistanceChanger {
	//변환할 거리 long(m)
	private long distance;
	//변환할 단위(cm , mm, km, inch)
	private String unit;
	//기본 생성자
	public DistanceChanger() {}
	//생성자(거리와 단위) = > 멤버변수 초기화
	public DistanceChanger(long distance, String unit) {
		this.distance = distance;
		this.unit = unit;
	}
	
	//선택된 단위로 거리를 변환해서 출력하는 메소드(m -> inch = m * 39.37)
	public void change() {
		switch(unit) {
			case "cm" : 
				System.out.println(unit + "로(으로) 변환된 거리 : " + (distance * 100) + unit);
				break;
			case "mm" :
				System.out.println(unit + "로(으로) 변환된 거리 : " + (distance * 1000) + unit);
				break;
			case "km" : 
				System.out.println(unit + "로(으로) 변환된 거리 : " + ((double)distance / 1000) + unit);
				break;
			case "inch" : 
				System.out.println(unit + "로(으로) 변환된 거리 : " + ((double)distance * 39.37) + unit);
				break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
					
 		}
	}
	
	
	
	
	
	
	
}
