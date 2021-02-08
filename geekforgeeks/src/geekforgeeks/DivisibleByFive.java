package geekforgeeks;

import java.math.BigInteger;
public class DivisibleByFive {
	public static void main(String[] args) {
		BigInteger num1 = new BigInteger("1245");
		
		BigInteger five = new BigInteger("5");
		BigInteger z = new BigInteger("0");
		int result=num1.mod(five).compareTo(z);
		if(result==0) {
			System.out.println("yes");
			
		}else {
			System.out.println("No");
		}
		
	}
}
