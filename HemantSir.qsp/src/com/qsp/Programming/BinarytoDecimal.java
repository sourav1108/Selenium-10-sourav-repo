package com.qsp.Programming;

import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary Number");
		int binary = sc.nextInt();
		int decimal = 0;
		int pow = 1;
		while (binary > 0) {
			decimal += (binary % 10) * pow;
			binary = binary / 10;
			pow = pow * 2;
		}
		System.out.println("Decimal Number : " + decimal);
	}
}
