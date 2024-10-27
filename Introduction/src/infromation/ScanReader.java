package infromation;

import java.util.Scanner;

public class ScanReader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter age: ");
		String age = sc.next();
		
		System.out.println("------Profile------");
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("age: " + age);
		sc.close();
	}
}
