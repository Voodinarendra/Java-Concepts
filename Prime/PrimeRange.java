package Prime;

import java.util.Scanner;

public class PrimeRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number : ");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second Number : ");
	int n2 = sc.nextInt();
	range(n1, n2);
	
}
public static void range(int lowerBound,int upperBound) {
	for(int i=lowerBound;i<=upperBound;i++) {
		int count = checkPrime(i);
		ifPrime(count,i);
	}
}
public static int checkPrime(int i) {
	int count =0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;
		}
	}
	return count;
}
public static void ifPrime(int count,int i) {
	if(count ==2) {
		System.out.print(i+" ");
	}
}
}
