package myjava;

import java.math.BigInteger;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��21������10:34:25
 * @type ��ϰ��
 */
public class Demo10_16 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
		int count = 0;
		while (count < 10) {
			if (number.remainder(new BigInteger("2")).intValue() == 0
					|| number.remainder(new BigInteger("3")).intValue() == 0) {
				System.out.println(number);
				count++;
			}
			number = number.add(new BigInteger("1"));
		}

	}

}
