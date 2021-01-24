package geekforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Consonants_Vowels {
	public static void main(String[] args) {
		// taking input using class Scanner
		Scanner sc = new Scanner(System.in);

		// taking total count of all testcases
		int t = sc.nextInt();
		sc.nextLine();
		boolean flag = false;
		while (t-- > 0) {

			// taking the input String
			String s = sc.nextLine();

			// Creating an object of class Geeks
			Geeks obj = new Geeks();

			// calling the checkString
			// method of class Geeks
			obj.checkString(s);

		}
	}
}

class Geeks {

	static void checkString(String s) {
		int v = 0;
		int c = 0, word = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') {
				word++;
			}
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				v++;
			} else {
				c++;
			}
		}
		System.out.println(c+" "+v+" "+" "+word);
		c = c - word;
		if (v > c)
			System.out.print("Yes");
		else if (c > v)
			System.out.print("No");
		else
			System.out.print("Same");

		System.out.println();
	}
}