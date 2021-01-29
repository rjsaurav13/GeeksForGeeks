package geekforgeeks;

import java.util.Scanner;

public class Almost_Equal {
	public static void main(String[] args) {
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.next();
		s2 = scanner.next();
		int count=0,count1=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
				}else {
					count1++;
				}
			}
		}
		System.out.println(count1);
		scanner.close();
	}
}
