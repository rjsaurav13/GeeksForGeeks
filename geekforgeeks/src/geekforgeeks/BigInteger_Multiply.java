package geekforgeeks;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */


import java.util.*;
import java.math.BigInteger;

// } Driver Code Ends

//User function Template for Java

/* Class MathematicalOperation with add fucntion
* x, y : Two parameters of BigIntegers to multiply
*/
class MathematicalOperationss {

	static BigInteger mul(BigInteger x, BigInteger y) {
		BigInteger mul;
		mul = x.multiply(y);
		return mul;

	}

}

//{ Driver Code Starts.

//Driver class with main function
class GFGss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			// Taking first element
			// in BigInteger x
			BigInteger x = sc.nextBigInteger();

			// Taking second element in
			// BigInteger y
			BigInteger y = sc.nextBigInteger();

			// Calling function add to add two BigIntegers
			MathematicalOperationss obj = new MathematicalOperationss();
			System.out.println(obj.mul(x, y));
		}
		sc.close();
	}
	
} // } Driver Code Ends