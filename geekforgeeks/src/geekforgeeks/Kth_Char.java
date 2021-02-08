package geekforgeeks;

import java.util.Scanner;

public class Kth_Char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int index = scanner.nextInt();
		if (str.length() >= index) {
			System.out.println(str.charAt(index));
		} else {
			index = (index % str.length());
			System.out.println(str.charAt(index));
		}
		scanner.close();
	}
}
