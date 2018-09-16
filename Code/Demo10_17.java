package myjava;

import java.math.BigInteger;

/**
 * @author wl
 * @date 创建时间：2018年6月23日上午9:19:47
 * @type 练习题
 */
public class Demo10_17 {

	public static void main(String[] args) {
		BigInteger N = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger num = N.add(BigInteger.ONE);
		int count = 0;
		while (count < 10) {
			if (isSquare(num)) {
				System.out.println(num);
				count++;
			}
			num = num.add(BigInteger.ONE);
		}
	}

	private static boolean isSquare(BigInteger num) {
		BigInteger i = BigInteger.ONE;
		while (num.compareTo(BigInteger.ZERO) > 0) {
			num = num.subtract(i);
			i = i.add(new BigInteger("2"));
		}
		return num.compareTo(BigInteger.ZERO) == 0;
	}
}
