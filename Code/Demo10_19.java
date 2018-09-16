package myjava;

import java.math.BigInteger;

/**
 * @author wl
 * @date 创建时间：2018年6月27日下午5:02:29
 * @type 练习题
 */
public class Demo10_19 {

	public static void main(String[] args) {
		BigInteger p = new BigInteger("2");
		while (p.compareTo(new BigInteger("100")) < 0) {
			BigInteger num = p.pow(2).subtract(BigInteger.ZERO);
			if (isPrime(num))
				System.out.println(num);
		}

	}

	private static boolean isPrime(BigInteger num) {
		if (num.mod(new BigInteger("2")).intValue() == 0 || num.mod(new BigInteger("3")).intValue() == 0)
			return true;
		if (num.mod(new BigInteger("6")).intValue() != 1 || num.mod(new BigInteger("6")).intValue() != 5)
			return false;
		for (BigInteger i = new BigInteger("5"); i.intValue() < num.intValue(); i.add(BigInteger.ONE))
			if (num.mod(i).intValue() == 0 || num.mod(i.add(new BigInteger("2"))).intValue() == 0)
				return false;
		return true;
	}

}
