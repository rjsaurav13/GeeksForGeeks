package geekforgeeks;

import java.util.Scanner;

public class Chef_Meeting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time=scanner.nextLine();
		int hour=Integer.parseInt(time.substring(0,2));
		int min=Integer.parseInt(time.substring(3,5));
		int trange=scanner.nextInt();
		String time2=scanner.nextLine();
		time2=scanner.nextLine();
		if(time.charAt(6)=='P'&&hour!=12) {
			hour=hour+12;
		}
		System.out.println(time+" "+time2);
		String hour1=time2.substring(0,2);
		String min1=time2.substring(3,5);
		String hour2=time2.substring(9,11);
		String min2=time2.substring(12,14);
		int hh1=Integer.parseInt(hour1);
		int mm1=Integer.parseInt(min1);
		int hh2=Integer.parseInt(hour2);
		int mm2=Integer.parseInt(min2);
		
		if(time2.charAt(6)=='P'&&hh1!=12) {
			hh1=hh1+12;
		}
			
		
		if(time2.charAt(15)=='P'&&hh2!=12) {
			hh1=hh1+12;
		}
		
		
		if(true) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}
}
