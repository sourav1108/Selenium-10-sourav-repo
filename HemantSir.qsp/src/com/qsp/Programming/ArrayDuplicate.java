package com.qsp.Programming;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int i, j;
		int n[] = { 10, 11, 13, 14, 11, 12, 11 };
		System.out.println("Duplicate Element is:");
		for (i = 0; i < n.length; i++) {
			for (j = i + 1; j < n.length; j++)

			{
				if (n[i] == n[j])
					System.out.println(n[i]);
			}

		}

	}
}
