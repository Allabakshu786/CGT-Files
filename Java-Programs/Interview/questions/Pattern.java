package questions;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = read.nextInt();
		int row;
		int col;
		System.out.println("*\n");
		for (row = 0; row <= n; row++) {
			System.out.print("*");
			for (col = 0; col <= n; col++) {
				System.out.print("");

			}
			System.out.println("*\n");
			for (col = 1; col <= n+2; col++) {
				System.out.print("*");

			}
		}

		read.close();
	}

}
