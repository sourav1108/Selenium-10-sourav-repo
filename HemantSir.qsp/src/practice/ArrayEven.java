package practice;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int[5];
		n[0] = 2;
		n[1] = 3;
		n[2] = 5;
		n[3] = 6;
		n[4] = 8;
		for (int i = 0; i <= n.length - 1; i++) {
			if (n[i] % 2 == 0) {
				System.out.println("even numbers are =" + n[i]);
			}
		}

	}

}
