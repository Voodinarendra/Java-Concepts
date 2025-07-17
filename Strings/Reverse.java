package String;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s  = sc.nextLine();
	String rev = new StringBuilder(s).reverse().toString();
	System.out.println(rev);
}
}
