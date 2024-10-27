package changingdata;

public class TypeCasting {
	public static void main(String[] args) {
		int i = 100;
		long j = i;
		float a = i;
		
		short k = (short)i;
		float b = 3.5f;
		int c = (int)b;
		
		System.out.println("k" + k);
		System.out.println("c" + c);
	}
	
	class Person {
		
	}
	
	class Student extends Person{
		
	}
	
	class Teacher extends Person{
		
	}
}
