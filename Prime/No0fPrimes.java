package Prime;

import java.util.Scanner;

public class No0fPrimes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	        int limit = sc.nextInt(); // Change this to any number you'd like
	        int count = 0;

	        for (int i = 2; i <= limit; i++) {
	            if (isPrime(i)) {
	                count++;
	            }
	        }
	        System.out.println("Number of prime numbers up to " + limit + " is: " + count);
	    }

	    // Helper method to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }
}
