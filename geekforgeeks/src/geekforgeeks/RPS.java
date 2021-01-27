package geekforgeeks;

import java.io.*;
import java.util.*;

public class RPS {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s;
			s = sc.next();

			Solution123 ob = new Solution123();

			System.out.println(ob.gameResult(s));
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution123 {
	String gameResult(String s) {
		if (s.charAt(0) == 'S' && s.charAt(1) == 'P' || s.charAt(0) == 'P' && s.charAt(1) == 'R'
				|| s.charAt(0) == 'R' && s.charAt(1) == 'S') {
			return "A";
		} else if (s.charAt(0) == 'P' && s.charAt(1) == 'S' || s.charAt(0) == 'R' && s.charAt(1) == 'P'
				|| s.charAt(0) == 'S' && s.charAt(1) == 'R') {
			return "B";
		} else {
			return "DRAW";
		}

	}
}