package geekforgeeks;

import java.util.Scanner;

public class knk {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int count = 0, tcase;
		tcase = scanner.nextInt();
		for (int j = 0; j < tcase; j++) {
			String num = scanner.next();
			for (int i = 1; i <= num.length(); i++) {
				if ((num.charAt(i) == '1' && num.charAt(i + 1) == '0' && num.charAt(i + 1) != '1')
						|| (num.charAt(i-1) == '0' && num.charAt(i) == '1' )) {
					count++;
				}

			}
			System.out.println(count);

		}
	}

}
