package myjava;

import java.math.BigInteger;

/**
 * @author wl
 * @date 创建时间：2018年6月27日下午4:48:27
 * @type 练习题
 */
public class Demo10_18 {

	public static void main(String[] args) {
		int count = 0;
		BigInteger bi = new BigInteger(String.valueOf(Long.MAX_VALUE));
		while (count < 5) {
			bi = bi.nextProbablePrime(); // 要想严格证明是素数，那就从0循环到bi/2验证下
			System.out.println(bi);
			count++;
		}

	}

}
