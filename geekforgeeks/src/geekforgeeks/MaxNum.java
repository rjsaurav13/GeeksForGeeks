package geekforgeeks;

import java.util.Scanner;

public class MaxNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		int len = num.length();
		int k = Integer.parseInt(num);
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			int temp;
			while (k != 0) {
				temp = k % 10;
				arr[i] = temp;
				k = k / 10;
			}

		}
		int temp1;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;

				}
			}
		}
		int t=0;
		for (int i = 0; i < len; i++) {
			t=t*arr[i];
		}
		String s=String.valueOf(t);
		System.out.println(s);
		scanner.close();
	}
}
