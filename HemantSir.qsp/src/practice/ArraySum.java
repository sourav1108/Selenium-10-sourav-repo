package practice;

public class ArraySum {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4 };
		int sum = 0;
		for (int i = 0; i <= n.length-1; i++) {
			sum = sum + n[i];
		}
		System.out.println("sum is - " + sum);

	}
}