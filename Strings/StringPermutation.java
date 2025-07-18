package String;

import java.util.Scanner;

public class StringPermutation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s = sc.nextLine();
	generatePermutation(s,"");
}
static void generatePermutation(String s,String ans) {
	// If String is Empty
	if(s.length()==0) {
		System.out.println(ans);
	}
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		
		String ros = s.substring(0,i)+s.substring(i+1);
		generatePermutation(ros, ans+ch);
		
	}
}
}
