package Homework;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		float b = input.useLocale(Locale.US).nextFloat();
		float c = input.useLocale(Locale.US).nextFloat();
		
		String aInHex = Integer.toHexString(a).toUpperCase();
		String aInBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		//if 'c' is a whole number we print it without digits after the sign
		if ( c == Math.floor(c)) {
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|\n",aInHex,aInBinary,b,c);
		}
		else {
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|\n",aInHex,aInBinary,b,c);
		}
	}
}
