package geekforgeeks;

import java.util.Scanner;

public class Sort_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tcase = scanner.nextInt();
		for (int i = 0; i < tcase; i++) {
			String s;
			s = scanner.next();
			char ch, ch1, ch2;
			for (int j = 0; j < s.length(); j++) {
				for (int k = j + 1; k < s.length(); k++) {
					if ((int) (s.charAt(j)) > (int) (s.charAt(k))) {
						ch = s.charAt(j);
						ch1 = s.charAt(j);
						ch1 = s.charAt(k);
						ch2 = s.charAt(k);
						ch2 = ch;
					}
				}
				System.out.println(s);
			}

		}

		scanner.close();
	}

}
