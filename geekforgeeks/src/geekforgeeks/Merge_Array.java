package geekforgeeks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Merge_Array {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

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

			int k = n + m;
			int arr3[] = new int[k];
			for (int i = 0; i < n; i++) {
				arr3[i] = arr1[i];
			}
			for (int j = n; j < m; j++) {
				arr3[j] = arr2[j];
			}
			for (int j = 0; j < k; j++) {
				System.out.println(arr3[j]+" ");
			}
		}
	}
}
