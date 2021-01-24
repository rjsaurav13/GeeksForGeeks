package geekforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

// } Driver Code Ends

//User function Template for Java

/* Class MathematicalOperation with mod fucntion
* x, y : Two parameters of BigIntegers to find mod
*/
class MathematicalOperation {

	static BigInteger mod(BigInteger x, BigInteger y) {
		BigInteger mod1;
		mod1 = x.mod(y);
		return mod1;

	}

}

//{ Driver Code Starts.

//Driver class with main function
class GFG {

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

			// Calling function add to find mod two BigIntegers
			MathematicalOperation obj = new MathematicalOperation();
			System.out.println(obj.mod(x, y));
		}

	}
}
