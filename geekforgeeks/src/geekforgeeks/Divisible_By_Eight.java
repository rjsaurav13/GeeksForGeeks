package geekforgeeks;

import java.util.Scanner;

public class Divisible_By_Eight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tcase = scanner.nextInt();
		for (int j = 0; j < tcase; j++) {
			int s = scanner.nextInt();
			
			if (s % 8 == 0) {
				System.out.println("Yes\n");
			} else {
				System.out.println("No\n");
			}
		}
		scanner.close();
	}
}
