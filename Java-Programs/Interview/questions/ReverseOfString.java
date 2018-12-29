package questions;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);
		String name = read.next();
		System.out.println(name.length());
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);
		read.close();
	}
	

}
