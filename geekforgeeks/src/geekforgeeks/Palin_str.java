package geekforgeeks;

import java.util.Scanner;

public class Palin_str {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int len = S.length();
		String s1 = "";
		for (int i = len - 1; i >= 0; i--) {
			s1 = s1 + S.charAt(i);
		}
		
		if(s1.equals(S)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		scanner.close();
	}
}
