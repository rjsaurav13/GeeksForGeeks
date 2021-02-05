package geekforgeeks;

import java.util.Scanner;

public class Maximum_Index {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int len=scanner.nextInt();
		int[] arr= new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=scanner.nextInt();
		}
		int max = arr[0];
	    int index = 0;

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) {
	            index = i;
	            max = arr[i];
	        }
	    }
	    System.out.println(index);

	}

}
