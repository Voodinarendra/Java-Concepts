package String;

import java.util.Scanner;

public class RotationCheck {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String : ");
	String s1 = sc.nextLine();
	System.out.println("Enter the second String : ");
	String s2 = sc.nextLine();
	
	if(isRotation(s1,s2)) {
		System.out.println("S2 is rotation of s1");
	}
	else {
		System.out.println("S2 is not rotation of s1");
	}
	}

	private static boolean isRotation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		String concated = s1 + s1 ;
		return concated.contains(s2);
	}
}
