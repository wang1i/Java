package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月10日下午10:01:56
 * @type 练习题
 */
public class Demo10_3 {

	public static void main(String[] args) {
		MyInteger m = new MyInteger(7);
		MyInteger n = new MyInteger(7);
		System.out.println(m.equals(n));
		System.out.println(MyInteger.isPrime(m));

	}

}
