package geekforgeeks;

import java.util.Scanner;

public class Adjacent_char {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int arr[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					arr[i] = i;
					
					
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (i == arr[i]) {
				System.out.println(s.charAt(i));
			}

		}

	}
}
