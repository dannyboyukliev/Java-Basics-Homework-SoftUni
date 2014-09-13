package Homework;

import java.util.Locale;
import java.util.Scanner;

public class PointsInsideHouse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x = scanner.useLocale(Locale.US).nextDouble();
		double y = scanner.useLocale(Locale.US).nextDouble();

		String inside = "Inside";
		String outside = "Outside";

		if (checkIfInsideOfRectangles(x, y) || checkIfInsideOfTriangle(x, y)) {
			System.out.println(inside);
		} else {
			System.out.println(outside);
		}
	}

	private static boolean checkIfInsideOfRectangles(double x, double y) {
		if (((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5))
				|| ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5))) {
			return true;
		}
		return false;
	}

	private static boolean checkIfInsideOfTriangle(double x, double y) {
		double x1 = 12.5;
		double y1 = 8.5;
		double x2 = 22.5;
		double y2 = 8.5;
		double x3 = 17.5;
		double y3 = 3.5;
		
		double A = area(x1, y1, x2, y2, x3, y3);
		double A1 = area(x, y, x2, y2, x3, y3);
		double A2 = area(x1, y1, x, y, x3, y3);
		double A3 = area(x1, y1, x2, y2, x, y);

		/* Check if sum of A1, A2 and A3 is same as A */
		return (A == A1 + A2 + A3);
	}
	
	private static double area(double x1, double y1, double x2, double y2, double x3, double y3)
	{
	   return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
}
