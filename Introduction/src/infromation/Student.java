package infromation;

public class Student {
	public int rno;
	static String university_name;
	public void display() {
		System.out.println("rno: " + rno);
		System.out.println("University_name: " + university_name );
	}
	
	public void show() {
		System.out.println("instance::");
	}
	
	public static void init() {
		System.out.println("static::");
	}
	
	public static void changeUniName(String name) {
		university_name = name;
		
	}
	
//	public static void main(String[] args) {
//		Student obj = new Student();
//		obj.display();
//	}
}
