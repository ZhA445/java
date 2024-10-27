package infromation;

public class Demo_1 {
	public static void main(String[] args) {
		Student std1 = new Student();

		std1.rno = 1;
		Student.university_name = "UFN";
		Student.init();
		std1.display();
	}
}
