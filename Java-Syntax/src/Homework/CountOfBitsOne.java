package Homework;

import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intNumber = scanner.nextInt();
		
		System.out.println(Integer.bitCount(intNumber));
	}
}
