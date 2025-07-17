package String;

import java.util.Scanner;

public class CharacterCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s = sc.nextLine();
	System.out.println("Enter the Charcater you want: ");
	char character = sc.next().charAt(0);
	int count=0;
	for(char ch : s.toCharArray()) {
		if(ch == character) {
			count++;
		}
	}
	System.out.println("No.of Times The Character Repeated: "+ count);
}
}
