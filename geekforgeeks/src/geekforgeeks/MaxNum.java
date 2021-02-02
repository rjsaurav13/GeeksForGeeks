package geekforgeeks;

import java.util.Scanner;

public class MaxNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp, num2 = 0;
		while (num != 0) {
			temp = num % 10;
			num2 = num2 + temp * 1;
			num = num / 10;
		}
		System.out.println(num2);
		scanner.close();

	}
}
