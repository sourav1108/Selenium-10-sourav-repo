package practice;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int n[] = new int[6];
		n[0] = 9;
		n[1] = 6;
		n[2] = 4;
		n[3] = 4;
		n[4] = 9;
		n[5] = 7;
		for (int i = 0; i <= n.length - 1; i++) {
			for (int j = i + 1; j <= n.length - 1; j++) {
				if (n[i] == n[j]) {
					System.out.println("The duplicate elements are : " + n[j]);
				}
			}
		}
	}

}
