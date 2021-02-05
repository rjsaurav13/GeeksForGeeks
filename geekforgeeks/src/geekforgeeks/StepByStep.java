package geekforgeeks;

import java.util.Scanner;

public class StepByStep {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n%2==0&&n%3==0&&n%11==0){
			System.out.println("Eleven");
		}
		else if(n%3==0&&n%11==0){
			System.out.println("Eleven");
		}
		else if(n%2==0&&n%11==0){
			System.out.println("Eleven");
		}
		else if(n%3==0&&n%2==0){
			System.out.println("Three");
		}
		else if(n%11==0){
			System.out.println("Eleven");
		}
		else if(n%3==0){
			System.out.println("Three");
		}
		else if(n%2==0){
			System.out.println("Two");
		}
		else if(n%2!=0&&n%3!=0&&n%11!=0){
			System.out.println("-1");
		}
		scanner.close();
	}
}
