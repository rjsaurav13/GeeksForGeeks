package geekforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class Balanced_Num {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		int len = N.length();
		BigInteger num = new BigInteger(N);
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum2 = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		for (int i = 0; i < len / 2; i++) {
			sum2 = sum2.add(num.mod(ten));
			num = num.divide(ten);
		}
		num = num.divide(ten);
		for (int i = 0; i < len / 2; i++) {
			sum1 = sum1.add(num.mod(ten));
			num = num.divide(ten);
		}

		int result = sum1.compareTo(sum2);
		if (result == 0) {
			// return true;
		} else {
			// return false;
		}
		scanner.close();
	}

}
