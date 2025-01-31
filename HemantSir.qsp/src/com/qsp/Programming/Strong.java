package com.qsp.Programming;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0) {

			int rem = n % 10;
			int fact = 1;

			for (int i = rem; i >= 1; i--) {
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		if (sum == temp)

		{
			System.out.println("Strong number");
		} else {
			
				System.out.println("Not Strong number");
			
		}
	}
}
