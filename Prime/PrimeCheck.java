package Prime;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		primeCheck(n);
	}
	public static void primeCheck(int n) {
		int count = 0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count ==1) {
			System.out.println(n +" is Prime Number.");
		}
		else {
			System.out.println(n +" is Not a Prime Number.");
		}
	}
	
}
