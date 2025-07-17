package String;

public class StringMethods {
public static void main(String[] args) {
	concatenation();
	length();
	accessing();
	subString();
	UpperAndLower();
	comparing();
	trimming();
}
// 1.Concatenation
static void concatenation() {
	String s1 = "Aniketh";
	String s2 = "Varma";
	
	System.out.println(s1+ " " + s2);
	System.out.println(s1.concat(" ").concat(s2));
}

// 2.Find Length
static void length() {
	String s = "Aniketh Varma";
	int length = s.length();
	System.out.println(length);
}
// 3.Accessing Character
static void accessing() {
	String s = "Aniketh Varma";
	char ch1 = s.charAt(0);
	char ch2 = s.charAt(5);
	
	System.out.println(ch1 + " " +ch2);
}
// 4.Substring
static void subString() {
	String s = "Aniketh Varma";
	String firstname = s.substring(0, 7);
	System.out.println(firstname);
}
// 5.Changing Case(Upper and Lower)
static void UpperAndLower() {
	String s = "Aniketh Varma";
	
	String s1 = s.toUpperCase();
	System.out.println(s1);
	
	String s2 = s.toLowerCase();
	System.out.println(s2);
}
// 6.Comparing (.equals checks the value and == checks the memory reference)
static void comparing() {
	String s1 = "Aniketh Varma";
	String s2 = "Aniketh Varma";
	if(s1.equals(s2)) {
		System.out.println("Login Succesfull");
	}
	else {
		System.out.println("Login Failed");
	}
}
//7.Trimming (Removes extra Spaces from beginning and ending, not in the middle)
static void trimming() {
	String s = "  Aniketh Varma ";
	String t = s.trim();
	System.out.println(t);
}
}
