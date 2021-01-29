package geekforgeeks;

import java.util.Scanner;
import java.lang.Math;

public class Narcissistic_Num {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String num1=String.valueOf(num);
		int temp, sum = 0;
		while (num != 0) {
			int pro = 1;
			temp = num % 10;
			pro=(int) Math.pow(temp,num1.length());
			sum = sum + pro;
			
			num = num / 10;
		}
		System.out.println(sum);
		scanner.close();

	}
}
