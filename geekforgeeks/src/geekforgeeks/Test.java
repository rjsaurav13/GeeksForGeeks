package geekforgeeks;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String s1 = "java.string.split.method.by.javatpoint";
		String[] words = s1.split(" ");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}
	}
}
