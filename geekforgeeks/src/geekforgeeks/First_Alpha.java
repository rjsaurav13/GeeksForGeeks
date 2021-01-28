package geekforgeeks;

import java.util.Scanner;

public class First_Alpha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S=scanner.next();
		String[] words = S.split(" ");
		int count=0;
		char ch[]= new char[S.length()];     
        for(int i=0;i<S.length();i++)  
        {  
            ch[i]= S.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
		   for(int i=0;i<count;i++) {
			   System.out.println(words[i].charAt(0));
		   }
	}
}
