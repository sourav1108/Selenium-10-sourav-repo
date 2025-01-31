package cpm.qsp.Pattern;

import java.util.Scanner;

public class HalloTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j == n + 1 || j - i == n - 1 || i == n)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();

		}
	}
}
