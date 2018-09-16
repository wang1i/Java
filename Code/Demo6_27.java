package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月25日下午3:34:32
 * @type 练习题
 */
public class Demo6_27 {

	public static void main(String[] args) {
		printReversePrime(100);

	}

	private static void printReversePrime(int n) {
		int i, count = 0;
		for (i = 2; count < 100; i++) {
			if (isPrime(i) && isPrime(reverse(i)) && i != reverse(i)) {
				System.out.printf("%-6d", i);
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}

	}

	private static boolean isPrime(int n) {
		int i;
		for (i = 2; i <= (int) Math.sqrt(n); i++)
			if (n % i == 0)
				break;
		if (i <= (int) Math.sqrt(n))
			return false;
		return true;
	}

	private static int reverse(int n) {
		int num = 0;
		while (n > 0) {
			num = num * 10 + n % 10;
			n = n / 10;
		}
		return num;
	}

}
