package geekforgeeks;

import java.util.Scanner;

public class Krishnamurthy_Num {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp, sum = 0;
		while (num != 0) {
			int pro = 1;
			temp = num % 10;
			for (int i = 1; i <= temp; i++) {
				pro = pro * i;
			}
			sum = sum + pro;
			
			num = num / 10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
