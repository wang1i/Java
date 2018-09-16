package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月25日上午10:15:50
 * @type 练习题
 */
public class Demo6_26 {

	public static void main(String[] args) {
		printPrimePalindrome(100);

	}

	public static void printPrimePalindrome(int n) {
		int i, count = 0;
		for (i = 2; count < n; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.print(i + "  ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}

	}

	public static boolean isPalindrome(int n) {
		int num = 0, temp = n;
		if (n == 0)
			return true;
		while (n > 0) {
			num = num * 10 + n % 10;
			n = n / 10;
		}
		if (num == temp)
			return true;
		return false;
	}

	public static boolean isPrime(int n) {
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
