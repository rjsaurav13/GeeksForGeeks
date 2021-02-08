package geekforgeeks;

public class Tester {
	public static void main(String[] args) {
		int n = 100;

		if (n < 10) {
			System.out.println(n);
		} else {
			int lnum = n % 10;
			while (n > 10) {
				n = n / 10;
			}
			int num=lnum + n;
			System.out.println(num);
		}

	}
}