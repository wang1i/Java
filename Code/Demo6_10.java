package myjava;

public class Demo6_10 {

	public static void main(String[] args) {
		int i, count = 0;
		for (i = 2; i <= 1000; i++) {
			if (isPrimeNum(i)) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}

	}

	public static boolean isPrimeNum(int n) {
		int i;
		for (i = 2; i <= (int) Math.sqrt(n); i++)
			if (n % i == 0)
				break;
		if (i <= (int) Math.sqrt(n))
			return false;
		else
			return true;
	}

}
