package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��10������10:01:56
 * @type ��ϰ��
 */
public class Demo10_3 {

	public static void main(String[] args) {
		MyInteger m = new MyInteger(7);
		MyInteger n = new MyInteger(7);
		System.out.println(m.equals(n));
		System.out.println(MyInteger.isPrime(m));

	}

}
