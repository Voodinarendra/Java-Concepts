package com.basics;

public class DiscountProblem {
public static void main(String[] args) {
	float amount=15000.00f;
	float discount =0.00f;
	if(amount>15000) {
		discount = amount * 0.3f;
	}
	else if(amount>10000) {
		discount = amount * 0.2f;
	}
	else if(amount>5000) {
		discount = amount * 0.1f;
	}
	else {
		discount = 0.00f;
	}
float final_amount = amount-discount;
System.out.printf("amount = %.2f\n",amount);
System.out.printf("discount = %.2f\n",discount);
System.out.printf("final_amount = %.2f\n",final_amount);

}
}
