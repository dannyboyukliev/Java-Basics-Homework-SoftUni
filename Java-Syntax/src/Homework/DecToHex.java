package Homework;

import java.util.Scanner;

public class DecToHex {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int decimalNumber = scanner.nextInt();
		
		System.out.println((Integer.toHexString(decimalNumber).toUpperCase()));
	}
}
