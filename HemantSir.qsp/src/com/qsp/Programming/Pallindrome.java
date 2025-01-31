package com.qsp.Programming;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println("Pallidrome");
		} else {
			System.out.println("Not Pallidrome");
		}

	}
}
