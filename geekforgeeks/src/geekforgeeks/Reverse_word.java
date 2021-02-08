package geekforgeeks;

import java.util.Scanner;

public class Reverse_word {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		s=scanner.next();
		String[] words = s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String temp=words[i];
			String rev="";
			for(int j=temp.length()-1;j>=0;j--) {
				rev=rev+temp.charAt(j);
			}
			System.out.println(rev);
		}
		
		scanner.close();
	}

}
