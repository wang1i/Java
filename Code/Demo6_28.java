package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月25日下午3:50:58
 * @type 练习题
 */
public class Demo6_28 {

	public static void main(String[] args) {
		System.out.println("p               2^p - 1");
		int num;
		for (int p = 2; p <= 31; p++) {
			num = (int) (Math.pow(2, p) - 1);
			if (isPrime(num)) {
				System.out.printf("%-2d%18d", p, num);
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

}
