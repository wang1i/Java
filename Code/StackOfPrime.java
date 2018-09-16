package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������11:36:22
 * @type ��ϰ��
 */
public class StackOfPrime {
	public static final int maxSize = 100;
	private int[] prime = new int[maxSize];
	private int top;

	public StackOfPrime(int value) {
		top = 0;
		for (int i = 2; i < value; i++) {
			if (isPrime(i))
				prime[top++] = i;
		}
	}

	public int[] getPrime() {
		return prime;
	}

	public int getTop() {
		return top;
	}

	private boolean isPrime(int value) {
		for (int i = 2; i <= Math.sqrt(value); i++)
			if (value % i == 0)
				return false;
		return true;
	}
}
