package com.qsp.Programming;

import java.util.Scanner;

public class DecimaltoBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Decimal Value to convert");
	int n=sc.nextInt();
	int bin = n;
while(n>0)
{
	int rem=n%2;
	bin=rem+bin;
	n=n/2;
	}
	System.out.println("Decimal Number : " + bin);
}
}
