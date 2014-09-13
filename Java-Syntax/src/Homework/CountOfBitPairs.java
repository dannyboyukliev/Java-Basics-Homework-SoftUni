package Homework;

import java.util.Scanner;

public class CountOfBitPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		String numberInBinary = Integer.toBinaryString(number);
		int counter = 0;
		for (int i=0; i<numberInBinary.length()-1; i++) {
			if (numberInBinary.charAt(i) == numberInBinary.charAt(i+1)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
