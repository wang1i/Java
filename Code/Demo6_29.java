package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��25������4:16:25
 * @type ��ϰ��
 */
public class Demo6_29 {

	public static void main(String[] args) {
		printDoublePrime(1000);

	}

	private static void printDoublePrime(int N) {
		int p1 = 2, p2, i;
		for (i = 3; i <= N; i++) {
			if (isPrime(i)) {
				p2 = i;
				if (p2 - p1 == 2)
					System.out.println("(" + p1 + "," + p2 + ")");
				p1 = p2;
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
