package myjava;

import java.math.BigInteger;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��27������4:48:27
 * @type ��ϰ��
 */
public class Demo10_18 {

	public static void main(String[] args) {
		int count = 0;
		BigInteger bi = new BigInteger(String.valueOf(Long.MAX_VALUE));
		while (count < 5) {
			bi = bi.nextProbablePrime(); // Ҫ���ϸ�֤�����������Ǿʹ�0ѭ����bi/2��֤��
			System.out.println(bi);
			count++;
		}

	}

}
