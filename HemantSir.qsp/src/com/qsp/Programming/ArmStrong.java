package com.qsp.Programming;

import java.util.*;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int count = 0;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		n = temp;
		while (n > 0) {
			int rem = n % 10;
			int fact = 1;
			for (int i = 1; i <= count; i++) {
				fact *= rem;
			}
			sum += fact;
			n /= 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
