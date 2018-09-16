package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月14日下午10:04:09
 * @type 练习题
 */
public class StackOfInteger {
	public static final int maxSize = 20;
	private int[] factor = new int[maxSize];
	private int top;

	public StackOfInteger(int value) {
		int i;
		top = 0;
		while (value > 0) {
			for (i = 2; i < value; i++)
				if (value % i == 0) {
					factor[top++] = i;
					break;
				}
			value /= i;
			if (value != 0 && value != 1 && isPrime(value))
				factor[top++] = value;
		}
	}

	private boolean isPrime(int value) {
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public int getTop() {
		return top;
	}

	public int[] getFactor() {
		return factor;
	}
}
