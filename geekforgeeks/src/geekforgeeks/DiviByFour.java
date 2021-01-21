package geekforgeeks;

import java.util.Scanner;

public class DiviByFour {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();

			System.out.println(new Sol().divisibleBy4(s));
		}
		sc.close();
	}
}

class Sol {
	int divisibleBy4(String N) {
		String s = "";
		int i;
		if (N.length() < 2) {
			i = Integer.parseInt(N);
		} else {
			s = N.substring(N.length() - 2);
			 i = Integer.parseInt(s);
		}
		if (i % 4 == 0) {
			return 1;
		} else {

			return 0;
		}
	}
}