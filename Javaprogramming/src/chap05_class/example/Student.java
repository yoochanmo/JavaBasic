package chap05_class.example;

public class Student {
	public static String school = "ezen";
	public static final String MAJOR = "ComputerEngineering";
	private int sNo;//학번
	private String sName;//학생이름
	private String grade; //취득 평점
	//다른 객체를 속성(멤버변수)로 선언할 수 있다.
	//하나의 클래스에서 다른 클래스를 참조하여 사용할 때 이것을 의존성이라고
	//표현한다.
	//Course의 내용이 변경되거나 속성이 바뀌면 Student도 변경될 수 밖에 없는데
	//이 때 Student가 Course에 의존되어 있으므로 의존성이라고 부른다.
	//좋은 프로그래밍은 결합도가 높고 의존도가 낮아야한다.
	//의존도를 낮추는 방법은 클래스 간에 참조관계를 적게 사용하는것이다. 
	private Course course; //수강과목
	
	//기본생성자 정의 안함
	
	//매개변수 있는 생성자(기본생성자가 없는 상태)
	//기본생성자 is undefined 에러를 방지하기 위해 기본생성자 정의
	public Student( ) {}
	
	public Student(int sNo) {
		this.sNo = sNo;
	}
	
	public Student(int sNo, String sName) {
		this(sNo);
		this.sName = sName;
	}
	
	public Student(int sNo, String sName, String grade) {
		this(sNo, sName);
		this.course = new Course(1, "java", 4);
		this.grade = grade;
	}
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public static void schoolInfo() {
		System.out.println(school);
	}
	
	public static void majorInfo() {
		System.out.println(MAJOR);
	}

	public void studentInfo() {
		System.out.println(sNo + " " + sName);
	}

	
		
	}

