package com.qsp.Programming;

import java.util.Scanner;

public class PerfectSquare {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to find perfect square");
		int n= sc.nextInt();
		
		for (int i=1;i<=n/2;i++) {
		
		if(i*i==n)
			System.out.println("Square " + i);
}
}
}
