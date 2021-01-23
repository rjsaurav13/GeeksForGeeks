package geekforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

class Sol1 {
	public String multiplyStrings(String s1, String s2) {
		BigInteger mul, i, j;
		i = new BigInteger(s1);
		j = new BigInteger(s2);
		mul = i.multiply(j);
		String s = mul.toString();
		return s;
	}
}

public class Multiply_Two_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String a = sc.next();
			String b = sc.next();
			Sol1 g = new Sol1();
			System.out.println(g.multiplyStrings(a, b));
		}
		sc.close();
	}

}
