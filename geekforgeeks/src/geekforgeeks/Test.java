package geekforgeeks;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int o = n + m;
		int arr3[] = new int[o];
		for (int i= 0;i<n;i++) {

			arr3[i]=arr1[i];
		}

		for (int i=0;i<m;i++) {

			arr3[n+i]=arr2[i];
		}

		
		int temp;
		for(int i=0;i<o;i++) {
			for(int j=i+1;j<o;j++) {
				if(arr3[i]>arr3[j]) {
					temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=arr3[i];
				}
			}
		}
		for (int e=0;e<o;e++) {

			System.out.println(arr3[e]);
		}

	}
}
