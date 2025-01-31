package com.qsp.Programming;

public class Automorphic {

	public static void main(String[] args) {
		int n = 376;
		int sq = n * n;
		boolean flag = true;
		while (n > 0) {
			if (n % 10 == sq % 10) {
				n /= 10;
				sq /= 10;
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("Automorphic");
		else
			System.out.println("Not a AutoMorphic");
	}
}
