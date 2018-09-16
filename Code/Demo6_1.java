package myjava;

public class Demo6_1 {

	public static void main(String[] args) {
		int res, count = 0;
		for (int i = 1; i <= 100; i++) {
			res = getPentaNum(i);
			System.out.printf("%6d", res);
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
	}

	public static int getPentaNum(int n) {
		int penta = n * (3 * n - 1) / 2;
		return penta;

	}
}
