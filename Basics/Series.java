package com.basics;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int n = scan.nextInt();
		nSeires(n);
	}
	public static void nSeires(int n) {
		
		int seriescount = 0;
		int count = 1;
		for(int i=1;i<=n;i++) {
			seriescount+=count;
			count++;
			
			if(i<n) {
				System.out.print(seriescount+",");
			}
			else {
				System.out.print(seriescount);
			}
			}
	}
}
