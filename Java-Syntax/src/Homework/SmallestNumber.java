package Homework;

import java.util.Locale;
import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float firstNumber = scanner.useLocale(Locale.US).nextFloat();
		float secondNumber = scanner.useLocale(Locale.US).nextFloat();
		float thirdNumber = scanner.useLocale(Locale.US).nextFloat();
		
		System.out.println(findSmallestNumber(firstNumber, secondNumber, thirdNumber));
	}
	
	public static float findSmallestNumber(float a, float b, float c) {
		if (a>=b && a>=c) {
			return a;
		} else if (b>=c) {
			return b;
		} else return c;
	}
}
