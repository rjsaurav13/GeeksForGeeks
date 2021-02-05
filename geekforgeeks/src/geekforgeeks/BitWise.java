package geekforgeeks;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class BitWise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();

		while (testcases-- > 0) {

			// taking a,b,c
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			// creating an object of class Geeks
			Test g = new Test();

			// calling the method bitWiseOp()
			// of class Geeks and passing
			// a,b,c as arguments
			g.bitWiseOp(a, b, c);
		}
	}

}

class Test {
	static void bitWiseOp(int a, int b, int c) {

		int d = a ^ a;
		System.out.println(d);
		int e = c ^ b;
		System.out.println(e);
		int f = a & b;
		System.out.println(f);
		int g = c | (a ^ a);
		System.out.println(g);
		e = ~e;
		System.out.println(e);
	}
}