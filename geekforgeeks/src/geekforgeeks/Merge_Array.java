package geekforgeeks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Merge_Array {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[m];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr1[i] = sc.nextInt();
			}
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < m; i++) {
				arr2[i] = sc.nextInt();
			}

			Solution obj=new Solution();
			obj.merge(arr1, arr2, n, m);

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr1[i] + " ");
			}
			for (int i = 0; i < m; i++) {
				str.append(arr2[i] + " ");
			}
			System.out.println(str);
		}

	}
}

class Solution {

	public void merge(int arr1[], int arr2[], int n, int m) {
        int k=n+m;
        int arr3[]=new int[k];
        for(int i=0;i<k;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<k;j++){
			arr3[j]=arr2[j];
        }
        for(int i=0;i<k;i++){
            System.out.println(arr3[i]+" ");
        }
    }
}