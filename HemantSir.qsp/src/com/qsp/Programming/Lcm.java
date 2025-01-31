package com.qsp.Programming;

import java.util.Scanner;

public class Lcm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first value");
	int a=sc.nextInt();
	System.out.println("enter second value");
	int b=sc.nextInt();
	int max= a>=b?a:b;
	
	while(true)
	{
		if(max % a==0 && max % b==0) {
			break;
		}
	max++;
}
    System.out.println("LCM of "+ a + " and "+ b +" is "+ max);
}
}