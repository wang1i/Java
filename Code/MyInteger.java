package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月10日下午10:18:41
 * @type 练习题
 */
public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		return false;
	}

	public boolean isPrime() {
		int i;
		for (i = 2; i < Math.sqrt(value); i++)
			if (value % 2 == 0)
				break;
		if (i < Math.sqrt(value))
			return false;
		return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0)
			return true;
		return false;
	}

	public static boolean isPrime(int value) {
		int i;
		for (i = 2; i < Math.sqrt(value); i++)
			if (value % 2 == 0)
				break;
		if (i < Math.sqrt(value))
			return false;
		return true;
	}

	public static boolean isEven(MyInteger m) {
		if (m.value % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(MyInteger m) {
		if (m.value % 2 != 0)
			return true;
		return false;
	}

	public static boolean isPrime(MyInteger m) {
		int i;
		for (i = 2; i < Math.sqrt(m.value); i++)
			if (m.value % 2 == 0)
				break;
		if (i < Math.sqrt(m.value))
			return false;
		return true;
	}

	public boolean equals(int value) {
		if (this.value == value)
			return true;
		return false;
	}

	public boolean equals(MyInteger m) {
		if (this.value == m.value)
			return true;
		return false;
	}

	public static int parseInt(char[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum * 10 + a[i] - '0';
		return sum;
	}

	public static int parseInt(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++)
			sum = sum * 10 + str.charAt(i) - '0';
		return sum;
	}
}
