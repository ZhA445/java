package infromation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name: ");
		String name = br.readLine();
		System.out.println("Enter salary: ");
		
		double salary = Double.parseDouble(br.readLine()); 
		
		br.close();
	}
}
