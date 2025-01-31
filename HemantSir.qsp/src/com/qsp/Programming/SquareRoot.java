package com.qsp.Programming;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	boolean flag=false;
	int i;
	for(i=1; i<= n/2;i++) {
		if(i*i== n) {
		flag= true;
		break;
		}
}
	if(flag==true)
		System.out.println("Perfect square of given number is : "+ i);
	else 
		System.out.println("There is no perfect square to the given number");
}
}
