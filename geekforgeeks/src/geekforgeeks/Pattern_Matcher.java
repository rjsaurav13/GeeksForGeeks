package geekforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;
class Pattern_Matcher
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   hello obj=new hello();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


 // } Driver Code Ends





//User function Template for Java



class hello{
    
    static void follPatt(String s)
    {
        
            int x = 0, y = 0;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'x') {
					x++;
				} else if (s.charAt(i) == 'y') {
					y++;
				}
			}
			if (x != y) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}       
      System.out.println();
    }
}
