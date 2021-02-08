package geekforgeeks;

import java.util.Scanner;

public class Test2345667 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2 = 0, num3 = 0;

		while (num != 0) {
			int temp = num % 10;
			if (temp == 0) {
				num2 = num2 * 10 + (temp + 5);
			} else {
				num2 = num2 * 10 + temp;
			}
			num = num / 10;
		}
		while (num2 != 0) {
			int temp1 = num2 % 10;
			num3 = num3 * 10 + temp1;

			num2 = num2 / 10;
		}
		System.out.println(num3);
		scanner.close();
	}
}
