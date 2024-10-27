package infromation;

import java.util.Scanner;

public class Input {
	
	static final int MIN_PRICE = 1000;
	static final float RATE = 1.5f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.print("Enter Price:");
		int price = sc.nextInt();
		System.out.println("Price:" + price);
		//filter
		if(price < MIN_PRICE) {
			price = 750;
		}
		///output
		System.out.println("Price: " + price);
		System.out.println("Expense: " + price * RATE);
	}
}
